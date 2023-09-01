public class Intro {
    public static void main(String[] args) throws Exception {
       
        // Controle de fluxo -> ajuste de como o programa vai realizar suas tarefas, seletivamente ou repetidamente ou condicionalmente ou excepcionalmente.

        /*
            Tipos de copntroles de fluxo
                - Condicional: if-else, switch-case
                - Repetição: for, while, do-while
                - Exceção: try-catch-finally, throw
         */

        /*  Estrutura condicional simples
                -> Dada uma condição positiva, segue a execução, caso contrário, o bloco não é executado
                Exemplo: O CODIGO ABAIXO SEM O ELSE 

            Estrutura condicional composta
                -> Dada uma condição negativa, o código passa para outro bloco de execução
                Exemplo: O CODIGO ABAIXO COM O ELSE
         */

        double saldo = 250.0;
        double valorSaque = 25.0;


        if(valorSaque<=saldo){
            saldo = saldo - valorSaque;

            System.out.println(saldo);

            } else {
                System.out.println("Saldo insuficiente");
                System.out.println(saldo);
            }

        System.out.println("FIM DO IF-ELSE");

    }
}
