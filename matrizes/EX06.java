// Gabriel Rodrigues

import java.util.Scanner;

class EX06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        int linhas, colunas, valor, ocorrencias = 0;
        final int VALOR_MAXIMO = 25;

        do {
            System.out.print("Linhas (maior que 1): ");
            linhas = scanner.nextInt();
        } while (linhas < 1);
        do {
            System.out.print("Colunas (maior que 1): ");
            colunas = scanner.nextInt();
        } while (colunas < 1);
        matriz = new int[linhas][colunas];

        do {
            System.out.print("Valor (entre 0 e 25): ");
            valor = scanner.nextInt();
        } while (valor < 0 || valor > 25);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = (int) (Math.random() * (VALOR_MAXIMO + 1));

                if (matriz[linha][coluna] == valor) {
                    ocorrencias++;
                }

                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }

        System.out.println();

        System.out.printf("Ocorrências de %d: %d\n", valor, ocorrencias);

        for (int linha = 0, contador = 0; linha < matriz.length && contador != ocorrencias; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length && contador != ocorrencias; coluna++) {
                if (matriz[linha][coluna] == valor) {
                    contador++;
                    System.out.printf("%dº [%d][%d]\n", contador, linha, coluna);
                }
            }
        }

        scanner.close();
    }
}