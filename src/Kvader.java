import java.util.Scanner;

public class Kvader implements GeometrickyTvar {

    private double lenght, width, height;


    public Kvader() {}
    @Override
    public void loadSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj dlzku kvadra:");
        lenght = scanner.nextDouble();
        System.out.println("Zadaj sirku kvadra:");
        width = scanner.nextDouble();
        System.out.println("Zadaj vysku kvadra:");
        height = scanner.nextDouble();

    }

    @Override
    public void outputProtocol() {
        System.out.println("=======");
        System.out.println("Kvader");
        System.out.println("=======");
        System.out.println("Dĺžka: " + lenght);
        System.out.println("Šírka: " + width);
        System.out.println("Výška: " + height);
        System.out.println("Povrch: " + calculateSurface());
        System.out.println("Objem: " + calculateVolume());
        System.out.println("Súčet hrán: " + calculateSumOfEdges());
    }

    private double calculateSurface() {
        return 2 * (lenght * width + width * height + lenght * height);
    }

    private double calculateVolume() {
        return lenght * width * height;
    }

    private double calculateSumOfEdges() {
        return 4 * (lenght + width + height);
    }
}
