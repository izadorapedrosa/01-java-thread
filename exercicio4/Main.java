public class Main {

    public static void main(String[] args) {

        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {5, 4, 3, 2, 1};

        Tarefa tarefa = new Tarefa(vetor1, vetor2);

        Thread thread = new Thread(tarefa);

        thread.start();
    }
}