// Gabriel Rodrigues.

import java.util.Arrays;
import java.util.Scanner;

class EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] raizes = new double[2];
        double a, b, c;

        System.out.print("Valor de a: ");
        a = scanner.nextDouble();

        System.out.print("Valor de b: ");
        b = scanner.nextDouble();

        System.out.print("Valor de c: ");
        c = scanner.nextDouble();

        raizes = calculaRaizes(a, b, c);
        System.out.printf("Raízes: %s\n", Arrays.toString(raizes));
    }

    public static double[] calculaRaizes(double a, double b, double c) {
        double[] raizes = new double[2];
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            raizes[0] = 0;
            raizes[1] = 0;
            return raizes;
        }

        raizes[0] = (-b + Math.sqrt(delta)) / 2 * a;
        raizes[1] = (-b - Math.sqrt(delta)) / 2 * a;

        return raizes;
    }
}