// Gabriel Rodrigues

import java.util.Scanner;

class EX29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        int[] vetorAuxiliar;
        int quantidadeElementosVetor;

        do {
            System.out.print("Quantidade elementos (maior que 1): ");
            quantidadeElementosVetor = scanner.nextInt();
        } while (quantidadeElementosVetor < 1);

        vetorAuxiliar = new int[quantidadeElementosVetor];
        matriz = new int[quantidadeElementosVetor][];
        for (int item = 0; item < vetorAuxiliar.length; item++) {
            vetorAuxiliar[item] = (int) (Math.random() * 10) + 1;
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            matriz[linha] = new int[vetorAuxiliar[linha] + 1];

            for (int coluna = 0, primo = 2; coluna < matriz[linha].length; coluna++) {
                if (coluna == 0) {
                    matriz[linha][coluna] = vetorAuxiliar[linha];
                    continue;
                }

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

            }
        }

        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.printf("%2d ", coluna);
            }
            System.out.println();
        }

        scanner.close();
    }
}