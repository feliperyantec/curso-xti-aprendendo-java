/**
 * "=" Operador de Atribuição
 * "==" Operador de Comparação
 * "!=" Operador de diferença
 * "instanceof" Compara Tipos
 */
public class OperadoresDeComparacao {

    public static void main(String[] args) {
        
        int x = 10;
        x == 10;
        System.out.println(x == 10);
        //System.out.println(x == "10"); Se for dado um valor tipo String, gera um erro: Incomparable types. Obs: erro gerado já na compilação.
        //System.ou.println(x instanceof int); Se for dado um valor tipo String, gera um erro: unexpected type. Obs: erro gerado já na compilação.
    }
}