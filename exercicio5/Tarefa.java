class Tarefa implements Runnable {

    private int[][] matriz1;
    private int[][] matriz2;

    public Tarefa(int[][] matriz1, int[][] matriz2) {
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
    }

    @Override
    public void run() {

        if (matriz1.length != matriz2.length
                || matriz1[0].length != matriz2[0].length) {

            System.out.println(
                "As matrizes precisam ter as mesmas dimensões."
            );

            return;
        }

        int linhas = matriz1.length;
        int colunas = matriz1[0].length;

        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {

                resultado[i][j] =
                    matriz1[i][j] + matriz2[i][j];

                System.out.println(
                    "Índice [" + i + "][" + j + "]: "
                    + matriz1[i][j] + " + "
                    + matriz2[i][j] + " = "
                    + resultado[i][j]
                );
            }
        }

        System.out.println("Tarefa finalizada!");
    }
}