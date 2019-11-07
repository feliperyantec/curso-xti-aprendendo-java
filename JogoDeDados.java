import java.util.*;

public class JogoDeDados {

    public static void main(String[] args) {

        try {

            Scanner s = new Scanner(System.in);
            System.out.println("Qual o seu Palpite?");
            int palpite = s.nextInt();

            Random r = new Random();
            int dado = r.nextInt(6) + 1;

            System.out.println("Palpite = " + palpite);
            System.out.println("Dado = " + dado);

            if (palpite == dado) {
                System.out.print("Acertou");
            } else {
                System.out.println("Errou");
            }

        } catch (InputMismatchException e) {
            System.out.println("Número Inválido...");
        }catch(Exception e){
            System.out.println("Falha no sistema...");
        }

    }
}