public class AutoBoxing{

    public static void main(String[] args) {
        
        Integer x = 555;
        x++; //desempacota, incrementa e reempacota
        System.out.println(x);
        
        Boolean v = new Boolean("True");
        if(v){
            System.out.println(v);
        }
    }
}