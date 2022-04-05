// Gabriel Rodrigues

import java.util.Scanner;

class EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        boolean zero;

        System.out.print("Informe um número: ");
        num = scanner.nextDouble();

        zero = eZero(num);
        System.out.printf("O número %.2f %s\n", num, zero ? "é zero" : "não é zero");

        scanner.close();
    }

    public static boolean eZero(double num) {
        return num == 0;
    }
}