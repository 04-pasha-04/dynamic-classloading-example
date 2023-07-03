import java.util.Scanner;

public class Trojuholnik implements GeometrickyTvar{
    private double a, b, c, height;

    public Trojuholnik() {}

    @Override
    public void loadSize() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Zadajte dĺžku strany a trojuholníka: ");
            this.a = scanner.nextDouble();
            System.out.println("Zadajte dĺžku strany b trojuholníka: ");
            this.b = scanner.nextDouble();
            System.out.println("Zadajte dĺžku strany c trojuholníka: ");
            this.c = scanner.nextDouble();
            if (!isValidTriangle(a, b, c)) {
                System.out.println("Zadané dĺžky strán nevytvárajú platný trojuholník. Skúste to prosím znova.");
            }
        } while (!isValidTriangle(a, b, c));
    }

    @Override
    public void outputProtocol() {
        System.out.println("=======");
        System.out.println("Trojuholník:");
        System.out.println("=======");
        System.out.println("Strana a: " + this.a);
        System.out.println("Strana b: " + this.b);
        System.out.println("Strana c: " + this.c);
        System.out.println("Obvod: " + calculatePerimeter());
        System.out.println("Plocha: " + calculateArea());
    }

    private double calculatePerimeter() {
        return this.a + this.b + this.c;
    }

    private double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
