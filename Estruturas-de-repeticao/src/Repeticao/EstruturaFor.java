package Repeticao;

public class EstruturaFor {
    public static void main(String[] args) throws Exception{

        // Laços de Repetição (for, while, do-while)

        /*  Estrutura for -> permite que uma variável contadora seja testada e incrementada a cada teste, até o break point definido dentro da estrutura. 
        As informações, incrementos e variavel contadora só ficam disponíveis dentro do bloco de codigo for.
            Descrição da estrutura: 
            for (bloco de inicialização; expressão booleana de validação; bloco de incremento)
                - o loop é executado até que a expressão booleana retorne false.
                exemplo:
        */
       
        for (int num = 1 ; num <= 3; num++){
            System.out.println(num);
        }

        // pode-se declarar o inicio fora do laço

        int i=0;
        for(; i<3 ;i++){
            System.out.println(i);
        }

    }
}
