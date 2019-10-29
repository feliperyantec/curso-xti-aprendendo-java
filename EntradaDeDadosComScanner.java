/**
 * Classes quando não são importadas geram erro: "cannot find symbol"
 * 
 */
import java.util.Scanner;

public class EntradaDeDadosComScanner {

    public static void main(String[] args) {
        
        //Chamada do programa
        //System.out.println(args[0]);

        //Interagindo com o Usuário
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = s.nextLine();
        System.out.println("Bem Vindo " + nome);
    }

}