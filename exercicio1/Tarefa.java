class Tarefa implements Runnable {

    private double n1;
    private double n2;
    private char operacao;

    public Tarefa(double n1, double n2, char operacao) {
        this.n1 = n1;
        this.n2 = n2;
        this.operacao = operacao;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            double valor1 = n1 + i;
            double valor2 = n2 * i;
            double resultado;

            switch (operacao) {

                case '+':
                    resultado = valor1 + valor2;
                    break;

                case '-':
                    resultado = valor1 - valor2;
                    break;

                case '*':
                    resultado = valor1 * valor2;
                    break;

                case '/':
                    if (valor2 == 0) {
                        System.out.println("Não é possível dividir por zero.");
                        return;
                    }

                    resultado = valor1 / valor2;
                    break;

                default:
                    System.out.println("Operação inválida.");
                    return;
            }

            System.out.println(
                "Passo " + i + ": "
                + valor1 + " " + operacao + " "
                + valor2 + " = " + resultado
            );
        }

        System.out.println("Tarefa finalizada!");
    }
}