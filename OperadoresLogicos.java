/**
 * "&&" Operador "And - e"
 * "||" Operador "Or - Ou" só irá retornar FALSE, se as duas expressões estiverem incorretas
 * "!" Operador "Not - Negação"
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        
        int x = 5;
        System.out.println((x >= 1) && (x<=10)); //Operador "e"
        System.out.println((x >= 1) || (x<=10)); //Operador "ou"
        System.out.println(!(x >= 1)); //Operador "não - negação"
    }
}