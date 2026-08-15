public class Main {

    public static void main(String[] args) {

        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matriz2 = {
            {6, 5, 4},
            {3, 2, 1}
        };

        Tarefa tarefa = new Tarefa(matriz1, matriz2);

        Thread thread = new Thread(tarefa);

        thread.start();
    }
}