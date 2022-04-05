// Gabriel Rodrigues

import java.util.Scanner;

class EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%dº número: ", i + 1);
            nums[i] = scanner.nextInt();
        }

        System.out.printf("O maior é: %d\n", maior(nums[0], nums[1], nums[2]));

        scanner.close();
    }

    public static int maior(int num1, int num2) {
        return num1 >= num2 ? num1 : num2;
    }

    public static int maior(int num1, int num2, int num3) {
        return num1 >= num2 && num1 >= num3 ? num1 : num2 >= num3 ? num2 : num3;
    }
}