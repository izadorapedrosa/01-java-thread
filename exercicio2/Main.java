public class Main {

    public static void main(String[] args) {

        Tarefa tarefa1 = new Tarefa("Jogador 1");
        Tarefa tarefa2 = new Tarefa("Jogador 2");

        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);

        t1.start();
        t2.start();
    }
}