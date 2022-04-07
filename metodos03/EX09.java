// Gabriel Rodrigues.

import java.util.Scanner;

class EX09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];

        for (int i = 0; i < nums.length; i++) {
            do {
                System.out.printf("%dº número (maior que 0): ", i + 1);
                nums[i] = scanner.nextInt();
            } while (nums[i] < 1);
        }

        System.out.printf("MMC: %d\n", calculaMMC(nums[0], nums[1]));

        scanner.close();
    }

    public static int calculaMMC(int num1, int num2) {
        int mmc = 1;

        for (int divisor = 2; num1 != 1 || num2 != 1;) {
            if (num1 % divisor == 0 || num2 % divisor == 0) {
                mmc *= divisor;

                if (num1 % divisor == 0) {
                    num1 /= divisor;
                }
                if (num2 % divisor == 0) {
                    num2 /= divisor;
                }
            } else {
                divisor++;
            }
        }

        return mmc;
    }
}