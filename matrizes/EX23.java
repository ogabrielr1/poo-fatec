// Gabriel Rodrigues

import java.util.Scanner;

class EX23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        int dimensao;

        do {
            System.out.print("Dimensão (maior que 1): ");
            dimensao = scanner.nextInt();
        } while (dimensao < 1);
        matriz = new int[dimensao][dimensao];

        for (int linha = 0, primo = 2; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                while (true) {
                    boolean ePrimo = true;

                    for (int divisor = 2; divisor < primo; divisor++) {
                        if (primo % divisor == 0) {
                            ePrimo = false;
                            break;
                        }
                    }

                    if (ePrimo) {
                        matriz[linha][coluna] = primo;
                        primo++;
                        break;
                    } else {
                        primo++;
                    }

                }

                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }

        scanner.close();
    }
}