/**
 * Modificador Final - assim que o modificador final é inserido em uma variavel a mesma não poderá ser alterada. error: "cannot assign a value to final variable"
 * 
 * Constantes - não usam a regra do CamelCase
 * Suas variaveis são escritas com todas as letras maiusculas, e se conter uma segunda palavra separada por "_" underline
 */

 public class ConstantesEModificadorFinal {

    public static void main(String[] args) {
        
        int populacaoBrasileira = 203258758;
        populacaoBrasileira = 132;

        final double PI = 3.1415;
        PI = 3.1416;
        final char SEXO_MASCULINO = 'M';
        final char SEXO_FEMININO = 'F';

        System.out.println(PI);
    }
 }