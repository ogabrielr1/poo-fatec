// Gabriel Rodrigues

class EX08 {
    public static void main(String[] args) {
        double[][] lancamentos = new double[6][2];

        for (int i = 0; i < 1000000; i++) {
            lancamentos[jogarDado() - 1][0]++;
        }

        for (int i = 0; i < lancamentos.length; i++) {
            lancamentos[i][1] = lancamentos[i][0] * 100 / 1000000;

            System.out.printf("%d: %.0f - %.2f%%\n", i + 1, lancamentos[i][0], lancamentos[i][1]);
        }
    }

    public static int jogarDado() {
        return (int) (Math.random() * 6) + 1;
    }
}