public class Main {

    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa(
            "Programacao em Java"
        );

        Thread thread = new Thread(tarefa);

        thread.start();
    }
}
