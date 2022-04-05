// Gabriel Rodrigues

import java.util.Scanner;

class EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%dº número: ", i + 1);
            nums[i] = scanner.nextInt();
        }

        System.out.printf("O menor é: %d\n", menor(nums[0], nums[1]));

        scanner.close();
    }

    public static int menor(int num1, int num2) {
        return num1 <= num2 ? num1 : num2;
    }
}