// Gabriel Rodrigues.

import java.util.Scanner;

class EX07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];

        for (int i = 0; i < nums.length; i++) {
            do {
                System.out.printf("%dº número (maior que 0): ", i + 1);
                nums[i] = scanner.nextInt();
            } while (nums[i] < 1);
        }

        System.out.printf("MDC: %d\n", calculaMDC(nums[0], nums[1]));

        scanner.close();
    }

    public static int calculaMDC(int num1, int num2) {
        int mdc = 1;

        for (int divisor = 2; num1 != 1 || num2 != 1;) {
            if (num1 % divisor == 0 && num2 % divisor == 0) {
                mdc *= divisor;
                num1 /= divisor;
                num2 /= divisor;
            } else if (num1 % divisor == 0) {
                num1 /= divisor;
            } else if (num2 % divisor == 0) {
                num2 /= divisor;
            } else {
                divisor++;
            }
        }

        return mdc;
    }
}