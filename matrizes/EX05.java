// Gabriel Rodrigues

import java.util.Scanner;

class EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] matrizes = new int[3][][];
        int linhas, colunas;

        do {
            System.out.print("Linhas (maior que 1): ");
            linhas = scanner.nextInt();
        } while (linhas < 1);
        do {
            System.out.print("Colunas (maior que 1): ");
            colunas = scanner.nextInt();
        } while (colunas < 1);

        for (int matriz = 0; matriz < matrizes.length; matriz++) {
            matrizes[matriz] = new int[linhas][colunas];
        }

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                matrizes[0][linha][coluna] = (int) (Math.random() * 100);
                matrizes[1][linha][coluna] = (int) (Math.random() * 100);
                matrizes[2][linha][coluna] = matrizes[0][linha][coluna] + matrizes[1][linha][coluna];

                System.out.printf("%2d ", matrizes[0][linha][coluna]);
            }

            System.out.print("  ");

            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.printf("%2d ", matrizes[1][linha][coluna]);
            }

            System.out.print("  ");

            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.printf("%3d ", matrizes[2][linha][coluna]);
            }

            System.out.println();
        }

        scanner.close();
    }
}