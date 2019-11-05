import java.util.ArrayList;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        
        List<String> cores = new ArrayList<>();
        cores.add("Branco");
        cores.add(0, "Vermelho");
        cores.add("Amarelo");
        cores.add("Azul");
        System.out.println(cores.toString());

        System.out.println("Tamanho =" + cores.size());
        System.out.println("Elemento2 =" + cores.get(0));
        System.out.println("Indice Branco =" + cores.indexOf("Branco"));

        cores.remove("Branco");

        System.out.println("Tem Cinza ?" + cores.contains("Branco"));

    }
}