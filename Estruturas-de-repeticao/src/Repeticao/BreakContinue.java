package Repeticao;

public class BreakContinue {
    public static void main(String[] args) {
        
        for(int n = 1; n <= 5; n++){
            if(n == 3)
            break;

            System.out.println(n);
        }

        System.out.println("pulando o 1");

        for(int n = 1; n <= 5; n++){
            if(n == 1)
            continue;

            System.out.println(n);
        }

    }
}
