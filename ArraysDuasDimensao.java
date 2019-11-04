public class ArraysDuasDimensao{

    public static void main(String[] args) {
        
        String[][] duasDimensao = {
            {"Ricardo", "M", "DF"},
            {"Sandra", "F", "MG"}};

            duasDimensao[1][0] = "SANDRA";

            System.out.println(duasDimensao[1][0]);
    }
}