package EstruturasExcepcionais;

public class CepFormarter {
    public static void main(String[] args) {
        try{

        String cepFormatado = cepFormarter("1010010");
        System.out.println(cepFormatado);
        }
        catch (CepInvalidoException e) {
           System.out.println("Confira se o cep está correto");;
        }
    }
    static String cepFormarter(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();

        //simulando um cep formatado
        return "10.100-100";
    }
}
