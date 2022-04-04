// Gabriel Rodrigues

import java.util.Scanner;

class EX20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        int dimensao;

        do {
            System.out.print("Dimensão (maior que 1): ");
            dimensao = scanner.nextInt();
        } while (dimensao < 1);
        matriz = new int[dimensao][dimensao];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = (int) (Math.random() * 100);

                if (linha >= coluna && linha + coluna >= dimensao - 1
                        || linha <= coluna && linha + coluna <= dimensao - 1) {
                    System.out.print("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}