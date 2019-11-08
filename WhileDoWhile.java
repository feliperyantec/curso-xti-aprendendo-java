import java.util.*;

public class WhileDoWhile {

    public static void main(String[] args) {
        
        List<String> produtos = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seus Produtos : Para Sair digite \"FIM\"");

        String produto;
        while(!"FIM".equals(produto = s.nextLine())) {
            produtos.add(produto);
        }
        System.out.println(produtos.toString());
    }
}