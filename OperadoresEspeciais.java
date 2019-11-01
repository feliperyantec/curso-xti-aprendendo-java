import java.util.Scanner;

public class OperadoresEspeciais {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o Raio:");
        double raio = s.nextDouble();

        //Diametro : 2r
        //double raio = 10;
        double diametro = 2 * raio;
        System.out.println("Diametro = " + diametro);

        //Circunferencia : 2 PI r
        double pi = Math.PI;
        double circunferencia = 2 * pi * raio;
        System.out.println("Circuferencia = " + circunferencia);

        //Area : PI r2
        double area = pi * (raio * raio);
        System.out.println("Area = " + area);

        //int idade = 10;
        //String x = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";
        //System.out.println(x);

        //String sexo = "M";
        //String pais = "Brasil";
        //String sexo = "M" , pais = "Brasil" , estado = "MT";
        //System.out.println(pais);
    }
}