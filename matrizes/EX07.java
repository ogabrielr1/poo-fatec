// Gabriel Rodrigues

import java.util.Scanner;

class EX07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        final int VALOR_MAXIMO = 99;
        int linhas, colunas, menor = VALOR_MAXIMO, maior = 0;

        do {
            System.out.print("Linhas (maior que 1): ");
            linhas = scanner.nextInt();
        } while (linhas < 1);
        do {
            System.out.print("Colunas (maior que 1): ");
            colunas = scanner.nextInt();
        } while (colunas < 1);
        matriz = new int[linhas][colunas];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = (int) (Math.random() * (VALOR_MAXIMO + 1));

                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }

                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }

        System.out.printf("\nMenor: %d\nMaior: %d\n\n", menor, maior);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (menor == maior) {
                    System.out.printf("%d: [%d][%d]\n", menor, linha, coluna);
                } else if (matriz[linha][coluna] == menor) {
                    System.out.printf("Menor: [%d][%d]\n", linha, coluna);
                } else if (matriz[linha][coluna] == maior) {
                    System.out.printf("Maior: [%d][%d]\n", linha, coluna);
                }
            }
        }

        scanner.close();
    }
}