// Gabriel Rodrigues.

import java.util.Scanner;

class EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta;

        System.out.print("Valor de a: ");
        a = scanner.nextDouble();

        System.out.print("Valor de b: ");
        b = scanner.nextDouble();

        System.out.print("Valor de c: ");
        c = scanner.nextDouble();

        delta = calculaDelta(a, b, c);
        System.out.printf("Delta: %.2f\n", delta);
    }

    public static double calculaDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}