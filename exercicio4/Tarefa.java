class Tarefa implements Runnable {

    private int[] vetor1;
    private int[] vetor2;

    public Tarefa(int[] vetor1, int[] vetor2) {
        this.vetor1 = vetor1;
        this.vetor2 = vetor2;
    }

    @Override
    public void run() {

        if (vetor1.length != vetor2.length) {
            System.out.println("Os vetores precisam ter o mesmo tamanho.");
            return;
        }

        int[] resultado = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {

            resultado[i] = vetor1[i] + vetor2[i];

            System.out.println(
                "Índice " + i + ": "
                + vetor1[i] + " + "
                + vetor2[i] + " = "
                + resultado[i]
            );
        }

        System.out.println("Tarefa finalizada!");
    }
}