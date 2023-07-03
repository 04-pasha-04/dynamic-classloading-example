import java.io.File;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<GeometrickyTvar> loadShapes(String folderPath) throws Exception {
        File shapesDir = new File(folderPath);
        URL shapesUrl = shapesDir.toURI().toURL();
        URL[] urls = new URL[]{shapesUrl};

        ClassLoader classLoader = new URLClassLoader(urls);
        List<GeometrickyTvar> shapes = new ArrayList<>();

        for (String file : shapesDir.list()) {
            if (file.endsWith(".class")) {
                String className = file.substring(0, file.length() - 6);
                if (!className.equals("Main")) {
                    Class<?> clazz = Class.forName(className, true, classLoader);
                    if (GeometrickyTvar.class.isAssignableFrom(clazz) && !Modifier.isAbstract(clazz.getModifiers())) {
                        shapes.add((GeometrickyTvar) clazz.getDeclaredConstructor().newInstance());
                    }
                }
            }
        }

        return shapes;
    }

    public static void main(String[] args) throws Exception {
        while(true){
            List<GeometrickyTvar> shapes = loadShapes("out/production/uloha2");
            Scanner scanner = new Scanner(System.in);

            int i;
            for (i = 0; i < shapes.size(); i++) {
                System.out.println((i + 1) + ". " + shapes.get(i).getClass().getSimpleName());
            }

            System.out.println((i + 1) + ". Koniec");
            int choice = scanner.nextInt();

            if(choice == i + 1){
                break;
            }

            GeometrickyTvar shape = shapes.get(choice - 1);
            shape.loadSize();
            shape.outputProtocol();
        }
    }
}