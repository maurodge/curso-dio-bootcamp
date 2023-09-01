package SwitchCase;

public class SwitchCase1 {
    public static void main(String[] args) throws Exception{

        String sigla ="g";

        switch (sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "p":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "m":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            case "g":{
                System.out.println("Grande");
                break;
            }
            default:{
                System.out.println("Indefinido");
            }
        }
    }
}
