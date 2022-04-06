// Gabriel Rodrigues

import java.util.Scanner;

class EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Informe a temperatura em Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = converteCelsiusParaFahrenheit(celsius);
        System.out.printf("Fahrenheit: %.2f\n", fahrenheit);

        scanner.close();
    }

    public static double converteCelsiusParaFahrenheit(double celsius) {
        return (9 * celsius / 5) + 32;
    }
}