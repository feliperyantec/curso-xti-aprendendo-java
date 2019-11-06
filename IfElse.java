public class IfElse {

    public static void main(String[] args) {
        
        int nota = 5;
        if (nota >= 7) { 
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
            
            if (nota <= 6) {
                System.out.println("Mas pode fazer a Recuperação!");
            }
        }
    }
}