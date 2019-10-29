/**
 * Conceitos de variaveis
 * @author Felipe Ryan
 * sem o tipo (String[] args) no metodo, a instrução de tipo "System.out.println" não executa. gera erro de "Metodo main não encontrado"
 * "=" operador de atribuição
 * "The value of the local variable nome is not used" esse aviso ocorre pois a variavel ainda não foi citada. com isso a IDE gera esse aviso.
 */

 public class Variaveis {

    public static void main(String[] args) {
        
        String nome = "FelipeRyan";
        int idade = 23;
        boolean Solteiro = true;

        System.out.println("Qual o nome:");
    }
 }