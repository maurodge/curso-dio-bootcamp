package Repeticao;

import java.util.Random;

public class DoWhile {
    
    public static void main(String[] args) {
        
        // do while testa o codigo depois de executar, ou seja, executa pelo menos uma vez mesmo a condição inicial sendo falsa

        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando... ");
        } while(tocando()); // chama o metodo random booleano de valores para tocando

        System.out.println("Alo!");

    }

    private static boolean tocando() {      // tocando  = true significa que atendeu
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
