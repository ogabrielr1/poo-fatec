// Gabriel Rodrigues

import java.util.Scanner;

class EX07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogar;

        while (true) {
            System.out.print("Jogar dado [s/n]: ");
            jogar = scanner.next().equalsIgnoreCase("s");

            if (jogar) {
                System.out.printf("Saiu: %d\n", jogarDado());
            } else {
                break;
            }
        }

        scanner.close();
    }

    public static int jogarDado() {
        return (int) (Math.random() * 6) + 1;
    }
}