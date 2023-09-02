package EstruturasExcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    
    public static void main(String[] args) {
        
        /*
          De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. 
          Já exceções é um FLUXO INESPERADO da aplicação, por exemplo, tentar abrir uma conexão com senha inválida. Neste caso, trata-se a exceção usando o try catch.
          A instrução finally permite definir um bloco de código a ser executado independente de ocorrer erro ou não. Seu uso é opcional 
         */
        try{

         Scanner sc = new Scanner(System.in).useLocale(Locale.US);
         
         System.out.println("Digite seu primeiro nome: ");
         String nome = sc.next();

         System.out.println("Digite seu primeiro sobrenome: ");
         String sobrenome = sc.next();

         System.out.println("Informe sua idade: ");
         int idade = sc.nextInt();

         System.out.println("Informe sua altura: ");
         float altura = sc.nextFloat();

         System.out.println("Nome " + nome + sobrenome + ", altura " + altura + ", idade " + idade);

         sc.close();
            }
            catch (InputMismatchException e){
                System.out.println("Os campos idade e altura precisam ser numericos no padrão US.");
            }

    }

}
