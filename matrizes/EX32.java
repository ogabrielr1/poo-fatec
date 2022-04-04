// Gabriel Rodrigues.

import java.util.Scanner;

class EX32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        int linhas, colunas;

        do {
            System.out.print("Linhas (maior que 1): ");
            linhas = scanner.nextInt();
        } while (linhas < 1);
        do {
            System.out.print("Colunas (maior que 1): ");
            colunas = scanner.nextInt();
        } while (colunas < 1);
        matriz = new int[linhas + 1][colunas + 1];

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0, soma = 0; coluna < colunas + 1; coluna++) {
                if (coluna == colunas) {
                    matriz[linha][coluna] = soma;
                    break;
                }

                matriz[linha][coluna] = (int) (Math.random() * 100);
                soma += matriz[linha][coluna];
            }
        }

        for (int coluna = 0; coluna < colunas; coluna++) {
            for (int linha = 0, soma = 0; linha < linhas + 1; linha++) {
                if (linha == linhas) {
                    matriz[linha][coluna] = soma;
                    break;
                }

                soma += matriz[linha][coluna];
            }
        }

        for (int linha = 0, soma = 0; linha < linhas + 1; linha++) {
            for (int coluna = 0; coluna < colunas + 1; coluna++) {
                if (linha == linhas && coluna == colunas) {
                    matriz[linha][coluna] = soma;
                    break;
                }

                if (linha == coluna) {
                    soma += matriz[linha][coluna];
                }
            }
        }

        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.printf("%3d ", coluna);
            }
            System.out.println();
        }

        scanner.close();
    }
}