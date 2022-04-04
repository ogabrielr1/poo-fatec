// Gabriel Rodrigues

import java.util.Scanner;

class EX22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] matrizes = new int[3][][];
        int[] quantidadeColunas = new int[3];
        int linhas;

        do {
            System.out.print("Linhas (maior que 1): ");
            linhas = scanner.nextInt();
        } while (linhas < 1);
        do {
            System.out.print("Colunas matriz 1 (maior que 1): ");
            quantidadeColunas[0] = scanner.nextInt();
        } while (quantidadeColunas[0] < 1);
        do {
            System.out.print("Colunas matriz 2 (maior que 1): ");
            quantidadeColunas[1] = scanner.nextInt();
        } while (quantidadeColunas[1] < 1);

        quantidadeColunas[2] = quantidadeColunas[0] + quantidadeColunas[1];
        for (int matriz = 0; matriz < matrizes.length; matriz++) {
            matrizes[matriz] = new int[linhas][quantidadeColunas[matriz]];
        }

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < quantidadeColunas[0]; coluna++) {
                matrizes[0][linha][coluna] = (int) (Math.random() * 100);
                System.out.printf("%2d ", matrizes[0][linha][coluna]);
            }

            System.out.print("  ");

            for (int coluna = 0; coluna < quantidadeColunas[1]; coluna++) {
                matrizes[1][linha][coluna] = (int) (Math.random() * 100);
                System.out.printf("%2d ", matrizes[1][linha][coluna]);
            }

            System.out.print("  ");

            for (int coluna = 0, colunaM1 = 0, colunaM2 = 0; coluna < quantidadeColunas[2]; coluna++) {
                if (quantidadeColunas[0] >= quantidadeColunas[1]) {
                    if (coluna % 2 == 0) {
                        matrizes[2][linha][coluna] = matrizes[0][linha][colunaM1++];
                    } else {
                        matrizes[2][linha][coluna] = matrizes[1][linha][colunaM2++];
                    }
                } else {
                    if (coluna % 2 == 0) {
                        matrizes[2][linha][coluna] = matrizes[1][linha][colunaM2++];
                    } else {
                        matrizes[2][linha][coluna] = matrizes[0][linha][colunaM1++];
                    }
                }

                System.out.printf("%2d ", matrizes[2][linha][coluna]);
            }

            System.out.println();
        }

        scanner.close();
    }
}