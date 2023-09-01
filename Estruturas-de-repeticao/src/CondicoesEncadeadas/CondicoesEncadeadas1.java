package CondicoesEncadeadas;

public class CondicoesEncadeadas1 {
    public static void main(String[] args) throws Exception {

        int nota =6;

        if(nota >= 7){
            System.out.println("Aprovado");
        }

        else if(nota >= 5 && nota < 7){
            System.out.println("Recuperação");

        } else {
            System.out.println("Reprovado");
        }

        // CONDICIONAL TERNÁRIA (uso de : é como se fosse um if)

        int pontuacao = 4;
        String resultado = pontuacao >=7 ? "Aprovado" : pontuacao >=5 && pontuacao<7 ? "Recuperação" : "Reprovado"; // primeiro valor para true, segundo valor para false
        System.out.println(resultado);
    }
}
