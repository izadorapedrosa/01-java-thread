import java.util.Random;

class Tarefa implements Runnable {

    private String nome;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {

        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1;

        System.out.println(nome + " iniciou o jogo.");
        System.out.println("Número secreto gerado.");

        boolean acertou = false;

        for (int tentativa = 1; tentativa <= 3; tentativa++) {

            int palpite = random.nextInt(10) + 1;

            System.out.println(
                nome + " - tentativa " + tentativa
                + ": palpite = " + palpite
            );

            if (palpite > numeroSecreto) {

                System.out.println(nome + ": maior");

            } else if (palpite < numeroSecreto) {

                System.out.println(nome + ": menor");

            } else {

                System.out.println(nome + ": acertou!");
                acertou = true;
                break;
            }
        }

        if (!acertou) {
            System.out.println(
                nome + " não acertou em 3 tentativas."
            );
        }

        System.out.println(nome + " finalizou o jogo!");
    }
}