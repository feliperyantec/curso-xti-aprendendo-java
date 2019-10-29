/**
 * 
 */
public class ClassesWrapper {

    public static void main(String[] args) {
        
        Double preco = new Double("12233");
        double d = preco.doubleValue();
        int i = preco.intValue();
        byte b = preco.byteValue();
        //string s1 = preco.toString();
        Boolean casado = new Boolean("true");

        //Conversão Estática
        double d1 = Double.parseDouble("123456");
        int i1 = Integer.parseInt("123");
        float f1 = Float.parseFloat("3.14F");

        int i2 = Integer.valueOf("101010", 2);
        System.out.println(b);
    }
}