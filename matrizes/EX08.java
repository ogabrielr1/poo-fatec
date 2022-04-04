// Gabriel Rodrigues

import java.util.Scanner;

class EX08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        int[] pares, impares;
        int linhas, colunas, quantidadePares = 0, quantidadeImpares = 0;

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
                matriz[linha][coluna] = (int) (Math.random() * (100));

                if (matriz[linha][coluna] % 2 == 0) {
                    quantidadePares++;
                } else {
                    quantidadeImpares++;
                }

                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }
        pares = new int[quantidadePares];
        impares = new int[quantidadeImpares];

        for (int linha = 0, contadorPares = 0, contadorImpares = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] % 2 == 0) {
                    pares[contadorPares++] = matriz[linha][coluna];
                } else {
                    impares[contadorImpares++] = matriz[linha][coluna];
                }
            }
        }

        if (quantidadePares > 0) {
            System.out.printf("\nPares: ");
            for (int par : pares) {
                System.out.printf("%d ", par);
            }
        } else {
            System.out.printf("\nNão há valores pares.");
        }

        if (quantidadeImpares > 0) {
            System.out.printf("\nÍmpares: ");
            for (int impar : impares) {
                System.out.printf("%d ", impar);
            }
        } else {
            System.out.printf("\nNão há valores ímpares.");
        }

        System.out.println();

        scanner.close();
    }
}