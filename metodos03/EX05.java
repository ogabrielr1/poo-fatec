// Gabriel Rodrigues

class EX05 {
    public static void main(String[] args) {
        for (int num = 1; num <= 1000; num++) {
            if (checaPrimo(num)) {
                System.out.printf("%d ", num);
            }
        }
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