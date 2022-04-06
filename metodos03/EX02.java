// Gabriel Rodrigues

import java.util.Scanner;

class EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        char escolha;

        System.out.print("[C]Celsius, [F]Fahrenheit e [S]Sair: ");
        escolha = scanner.next().toLowerCase().charAt(0);

        switch (escolha) {
            case 'c':
                System.out.print("Informe a temperatura em Celsius: ");
                celsius = scanner.nextDouble();
                fahrenheit = converteCelsiusParaFahrenheit(celsius);
                System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
                break;
            case 'f':
                System.out.print("Informe a temperatura em Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = converteFahrenheitParaCelsius(fahrenheit);
                System.out.printf("Celsius: %.2f\n", celsius);
                break;
            case 's':
                break;
            default:
                System.out.println("Escolha inválida!");
        }

        scanner.close();
    }

    public static double converteCelsiusParaFahrenheit(double celsius) {
        return (9 * celsius / 5) + 32;
    }

    public static double converteFahrenheitParaCelsius(double fahrenheit) {
        return 5 * (fahrenheit - 32) / 9;
    }
}