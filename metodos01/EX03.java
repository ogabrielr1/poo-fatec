// Gabriel Rodrigues

import java.util.Scanner;

class EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        boolean zero, positivo;

        System.out.print("Informe um número: ");
        num = scanner.nextDouble();

        zero = eZero(num);
        if (zero) {
            System.out.printf("O número %.2f %s\n", num, zero ? "é zero" : "não é zero");
        } else {
            positivo = ePositivo(num);
            System.out.printf("O número %.2f é %s\n", num, positivo ? "positivo" : "negativo");
        }

        scanner.close();
    }

    public static boolean eZero(double num) {
        return num == 0;
    }

    public static boolean ePositivo(double num) {
        return num > 0;
    }
}