// Gabriel Rodrigues

class EX02 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = (int) (Math.random() * 100);
                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }

        System.out.println();

        for (int linha = matriz.length - 1; linha >= 0; linha--) {
            for (int coluna = matriz[linha].length - 1; coluna >= 0; coluna--) {
                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }
    }
}