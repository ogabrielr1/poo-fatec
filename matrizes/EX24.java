// Gabriel Rodrigues

import java.util.Scanner;

class EX24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        int dimensao;

        do {
            System.out.print("Dimensão (maior que 1): ");
            dimensao = scanner.nextInt();
        } while (dimensao < 1);
        matriz = new int[dimensao][dimensao];

        for (int linha = 0, primeiro = 0, segundo = 1, auxiliar; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = primeiro;

                auxiliar = primeiro;
                primeiro += segundo;
                segundo = auxiliar;

                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }

        scanner.close();
    }
}