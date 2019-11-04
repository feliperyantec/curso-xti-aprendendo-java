/**
 * Colocando um valor que não existe dentro dos Arrays, gera erro de Exception in thread "main"
 */

import java.util.Arrays;

public class ArraysSimples {

    public static void main(String[] args) {
        
        String[] paises = {"Brasil", "Russia", "India", "China"};
        System.out.println(Arrays.toString(paises));

        int posicao = Arrays.binarySearch(paises, "Russia");
        System.out.println(posicao);

        Arrays.sort(paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));

        Double[] valores = {12.5, 855.879};
        System.out.println(valores[3].doubleValue());
    }
}