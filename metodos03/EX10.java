// Gabriel Rodrigues.

import java.util.Scanner;

class EX10 {
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

        System.out.printf("MMC: %d\n", calculaMMC(valores));

        scanner.close();
    }

    public static int calculaMMC(int[] valores) {
        int mmc = 1;

        for (int divisor = 2;;) {
            boolean iguaisA1 = true, dividiu = false;

            for (int i = 0; i < valores.length; i++) {
                if (valores[i] != 1) {
                    iguaisA1 = false;
                }

                if (valores[i] % divisor == 0) {
                    dividiu = true;
                    valores[i] /= divisor;
                }
            }

            if (dividiu) {
                mmc *= divisor;
            } else {
                divisor++;
            }

            if (iguaisA1) {
                break;
            }
        }

        return mmc;
    }
}