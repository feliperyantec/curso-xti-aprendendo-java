import java.lang.ProcessBuilder.Redirect;
import java.util.*;

public class Switch {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
            System.out.println("Informe a Tecnologia:");
            String tecnologia = s.next();


        switch (tecnologia) {

            case "java":
            case "c++":
            case "CShap":
                System.out.print("Linguagem de Programação");
                break;
            case "oracle":
            case "sqlserver":
            case "postgresql":
                System.out.println("Banco de Dados");
                break;
            default:
                System.out.println("Tecnologia Desconhecida");
        }
    }
}