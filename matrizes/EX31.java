// Gabriel Rodrigues

import java.util.Scanner;

class EX31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        int linhas, colunas, valorMaximo, valorMinimo;

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
            System.out.print("Valor minímo (maior que 1): ");
            valorMinimo = scanner.nextInt();
        } while (valorMinimo < 1);
        do {
            System.out.print("Valor máximo (maior que 1): ");
            valorMaximo = scanner.nextInt();
        } while (valorMaximo < 1);

        if (valorMaximo < valorMinimo) {
            int auxiliar = valorMaximo;
            valorMaximo = valorMinimo;
            valorMinimo = auxiliar;
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = (int) (Math.random() * (valorMaximo - valorMinimo + 1)) + valorMinimo;
                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }

        scanner.close();
    }
}