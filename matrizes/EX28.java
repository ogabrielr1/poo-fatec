// Gabriel Rodrigues

import java.util.Arrays;
import java.util.Scanner;

class EX28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] matrizes = new int[2][][];
        int[] vetorAuxiliar;
        int linhas, colunas;

        do {
            System.out.print("Linhas (maior que 1): ");
            linhas = scanner.nextInt();
        } while (linhas < 1);
        do {
            System.out.print("Colunas (maior que 1): ");
            colunas = scanner.nextInt();
        } while (colunas < 1);

        vetorAuxiliar = new int[linhas];
        for (int matriz = 0; matriz < matrizes.length; matriz++) {
            matrizes[matriz] = new int[linhas][colunas];
        }

        for (int coluna = 0; coluna < colunas; coluna++) {
            for (int linha = 0, indiceVetor = 0; linha < linhas; linha++) {
                matrizes[0][linha][coluna] = (int) (Math.random() * 100);
                vetorAuxiliar[indiceVetor++] = matrizes[0][linha][coluna];
            }

            Arrays.sort(vetorAuxiliar);

            for (int linha = 0, indiceVetor = 0; linha < linhas; linha++) {
                matrizes[1][linha][coluna] = vetorAuxiliar[indiceVetor++];
            }
        }

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.printf("%2d ", matrizes[0][linha][coluna]);
            }

            System.out.print("  ");

            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.printf("%2d ", matrizes[1][linha][coluna]);
            }

            System.out.println();
        }

        scanner.close();
    }
}