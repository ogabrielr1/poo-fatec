// Gabriel Rodrigues.

import java.util.Scanner;

class EX08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores;
        int quantidadeValores;

        do {
            System.out.print("Quantidade de valores (maior que 0): ");
            quantidadeValores = scanner.nextInt();
        } while (quantidadeValores < 1);
        valores = new int[quantidadeValores];

        for (int i = 0; i < quantidadeValores; i++) {
            do {
                System.out.printf("%dº valor (maior que 0): ", i + 1);
                valores[i] = scanner.nextInt();
            } while (valores[i] < 1);
        }

        System.out.printf("MDC: %d\n", calculaMDC(valores));

        scanner.close();
    }

    public static int calculaMDC(int[] valores) {
        int mdc = 1;

        for (int divisor = 2;;) {
            boolean iguaisA1 = true, dividiuTodos = true, dividiuNenhum = true;

            for (int i = 0; i < valores.length; i++) {
                if (valores[i] != 1) {
                    iguaisA1 = false;
                }

                if (valores[i] % divisor != 0) {
                    dividiuTodos = false;
                } else {
                    dividiuNenhum = false;
                    valores[i] /= divisor;
                }
            }

            if (dividiuTodos) {
                mdc *= divisor;
            } else if (dividiuNenhum) {
                divisor++;
            }

            if (iguaisA1) {
                break;
            }
        }

        return mdc;
    }
}