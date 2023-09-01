package Repeticao;

public class ForEmArrays {
    public static void main(String[] args) throws Exception{

        String alunos[] = {"Pedro", "Paulo", "Luiz"};

        for(int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);
            }

        // forma for / each 
        System.out.println("Forma abreviada com for / each");

        for(String estudante : alunos) {
            System.out.println(estudante);
        }
    }
}
