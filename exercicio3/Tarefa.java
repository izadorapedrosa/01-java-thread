class Tarefa implements Runnable {

    private String texto;

    public Tarefa(String texto) {
        this.texto = texto;
    }

    @Override
    public void run() {

        int quantidadeCaracteres = texto.length();

        System.out.println("Texto: " + texto);
        System.out.println(
            "Quantidade de caracteres: "
            + quantidadeCaracteres
        );

        System.out.println("Tarefa finalizada!");
    }
}