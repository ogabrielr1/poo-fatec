// Gabriel Rodrigues

import java.util.Scanner;

class EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        boolean positivo;

        System.out.print("Informe um número: ");
        num = scanner.nextDouble();

        positivo = ePositivo(num);
        System.out.printf("O número %.2f é %s\n", num, positivo ? "positivo" : "negativo");

        scanner.close();
    }

    public static boolean ePositivo(double num) {
        return num >= 0;
    }
}