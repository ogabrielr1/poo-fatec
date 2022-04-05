// Gabriel Rodrigues

import java.util.Scanner;

class EX06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, menor = Integer.MAX_VALUE;
        boolean continuar;

        do {
            System.out.print("Informe um número inteiro: ");
            num = scanner.nextInt();

            menor = menor(num, menor);

            System.out.print("Informar outro número [s/n]: ");
            continuar = scanner.next().equalsIgnoreCase("s");
        } while (continuar);

        System.out.printf("O menor é: %d\n", menor);

        scanner.close();
    }

    public static int menor(int num1, int num2) {
        return num1 <= num2 ? num1 : num2;
    }
}