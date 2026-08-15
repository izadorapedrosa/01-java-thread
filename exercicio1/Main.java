public class Main {

    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa(10, 5, '+');

        Thread thread = new Thread(tarefa);

        thread.start();
    }
}