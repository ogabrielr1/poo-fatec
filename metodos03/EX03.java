// Gabriel Rodrigues

import java.util.Scanner;

class EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit, kelvin;
        char escolha;

        System.out.print("[C]Celsius, [F]Fahrenheit, [K]Kelvin e [S]Sair: ");
        escolha = scanner.next().toLowerCase().charAt(0);

        switch (escolha) {
            case 'c':
                System.out.print("Informe a temperatura em Celsius: ");
                celsius = scanner.nextDouble();
                fahrenheit = converteCelsiusParaFahrenheit(celsius);
                System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
                kelvin = converteCelsiusParaKelvin(celsius);
                System.out.printf("Kelvin: %.2f\n", kelvin);
                break;
            case 'f':
                System.out.print("Informe a temperatura em Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = converteFahrenheitParaCelsius(fahrenheit);
                System.out.printf("Celsius: %.2f\n", celsius);
                kelvin = converteCelsiusParaKelvin(celsius);
                System.out.printf("Kelvin: %.2f\n", kelvin);
                break;
            case 'k':
                System.out.print("Informe a temperatura em Kelvin: ");
                kelvin = scanner.nextDouble();
                celsius = converteKelvinParaCelsius(kelvin);
                System.out.printf("Celsius: %.2f\n", celsius);
                fahrenheit = converteCelsiusParaFahrenheit(celsius);
                System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
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

    public static double converteCelsiusParaKelvin(double celsius) {
        return celsius + 273;
    }

    public static double converteKelvinParaCelsius(double kelvin) {
        return kelvin - 273;
    }
}