import java.util.Scanner;

public class Kruh implements GeometrickyTvar {

    private double diameter;

    public Kruh() {}

    @Override
    public void loadSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadaj priemer kruhu: ");
        this.diameter = scanner.nextDouble();


    }



    @Override
    public void outputProtocol() {
        System.out.println("=======");
        System.out.println("Kruh:");
        System.out.println("=======");
        System.out.println("Polomer: " + this.diameter/2);
        System.out.println("Plocha: " + Math.PI * Math.pow(this.diameter/2, 2));
        System.out.println("Obvod: " + 2 * Math.PI * this.diameter/2);
    }
}
