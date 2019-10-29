/**
 * GC - Garbage Collector - Valor citado anteriomente já substituido por outro é coletado pelo Garbage Collector, para estar sempre limpando espaço na memoria do seu projeto.
 * 
 */
public class VariavelDeReferencia {

    public static void main(String[] args) {
        
        //Variavel Primitiva
        int x = 7;
        x = 9;

        //Variavel de Referencia
        String y = "FRS";
        y = "frs.com.br";
        y = null;
        System.out.println(y);
    }
}