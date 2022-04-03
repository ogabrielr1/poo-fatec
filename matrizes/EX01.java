// Gabriel Rodrigues

import java.util.Scanner;

class EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][5];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf("[%d][%d]: ", linha, coluna);
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        System.out.println();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf("%d ", matriz[linha][coluna]);
            }
            System.out.println();
        }

        scanner.close();
    }
}