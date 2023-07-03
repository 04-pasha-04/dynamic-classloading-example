import java.util.Scanner;

public class Obdlznik implements GeometrickyTvar {
    private double lenght;
    private double width;

    public Obdlznik() {}
    @Override
    public void loadSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj dlzku obdlznika: ");
        this.lenght = scanner.nextDouble();
        System.out.println("Zadaj sirku obdlznika: ");
        this.width = scanner.nextDouble();
    }

    @Override
    public void outputProtocol() {
        System.out.println("=======");
        System.out.println("Obdlznik:");
        System.out.println("=======");
        System.out.println("Dlzka: " + this.lenght);
        System.out.println("Sirka: " + this.width);
        System.out.println("Plocha: " + this.lenght * this.width);
        System.out.println("Obvod: " + 2 * (this.lenght + this.width));
        System.out.println("Uhlopriečka: " + Math.sqrt(Math.pow(this.lenght, 2) + Math.pow(this.width, 2)));
    }
}
