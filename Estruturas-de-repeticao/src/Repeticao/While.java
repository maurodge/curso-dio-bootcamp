package Repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class While {

    // Testa antes de executar, se a condicional começar falsa, ele sai do bloco imediatamente.

    public static void main(String[] args) {
    
        double mesada = 20;
        while(mesada > 0){
            double valorDoce = valorAleatorio();

           /* if(valorDoce > mesada){
                valorDoce = mesada      // neste bloco if, iguala-se os valores para acabar com o dinehiro sem ter resto negativo 
            }
            */
            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;     
        }

        System.out.println("Saldo: " + mesada);
        System.out.println("João torrou toda grana");
        
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8); // sorteando um numero double aleatoriamente entre 2 e 8
    }
}
