// Gabriel Rodrigues

import java.util.Scanner;

class EX06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] primos;
        int inicio, fim;

        System.out.print("Informe um valor: ");
        inicio = scanner.nextInt();

        System.out.print("Informe outro valor: ");
        fim = scanner.nextInt();

        primos = geraArrayPrimos(inicio, fim);
        for (int primo : primos) {
            System.out.print(primo + " ");
        }

        scanner.close();
    }

    public static int[] geraArrayPrimos(int inicio, int fim) {
        if (inicio > fim) {
            int auxiliar = inicio;
            inicio = fim;
            fim = auxiliar;
        }

        int[] primos;
        int quantidadePrimos = 0;

        for (int num = inicio; num <= fim; num++) {
            if (checaPrimo(num)) {
                quantidadePrimos++;
            }
        }

        primos = new int[quantidadePrimos];

        for (int num = inicio, indice = 0; indice < primos.length; num++) {
            if (checaPrimo(num)) {
                primos[indice++] = num;
            }
        }

        return primos;
    }

    public static boolean checaPrimo(int num) {
        if (num < 2) {
            return false;
        }

        boolean primo = true;

        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                primo = false;
                break;
            }
        }

        return primo;
    }
}