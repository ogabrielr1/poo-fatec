// Gabriel Rodrigues

import java.util.Scanner;

class EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3], dadosNotas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%dº nota: ", i + 1);
            notas[i] = scanner.nextDouble();

            if (notas[i] < 0 || notas[i] > 10) {
                notas[i] = 0;
            }
        }

        dadosNotas = calculaDadosNotas(notas);

        System.out.printf("Média maiores: %.1f\n", dadosNotas[0]);
        System.out.printf("Média aritmética: %.1f\n", dadosNotas[1]);
        System.out.printf("Maior nota: %.1f\n", dadosNotas[2]);
        System.out.printf("Menor nota: %.1f\n", dadosNotas[3]);
    }

    public static double[] calculaDadosNotas(double[] notas) {
        double[] dadosNotas = new double[4];

        dadosNotas[0] = (notas[0] <= notas[1] && notas[0] <= notas[2] ? notas[1] + notas[2]
                : notas[1] >= notas[2] ? notas[0] + notas[1] : notas[0] + notas[2]) / 2;
        dadosNotas[1] = (notas[0] + notas[1] + notas[2]) / 3;
        dadosNotas[2] = Math.max(Math.max(notas[0], notas[1]), notas[2]);
        dadosNotas[3] = Math.min(Math.min(notas[0], notas[1]), notas[2]);

        return dadosNotas;
    }
}