// Gabriel Rodrigues

import java.util.Scanner;

class EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        int dimensao;

        do {
            System.out.print("Dimensão (entre 1 e 20): ");
            dimensao = scanner.nextInt();
        } while (dimensao > 20 || dimensao < 1);
        matriz = new int[dimensao][dimensao];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = (int) (Math.random() * 100);
                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }

        scanner.close();
    }
}