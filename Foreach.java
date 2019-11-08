import java.util.*;

public class Foreach {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
                list.add(i);
        }
        for (Integer numero : list){
            System.out.println(numero);        }

    }
}