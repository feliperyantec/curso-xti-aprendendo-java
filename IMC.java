import javax.swing.JOptionPane;

public class IMC {

    public static void main(String[] args) {
        
        String peso = JOptionPane.showInputDialog("Qual o seu Peso?");
        String altura = JOptionPane.showInputDialog("Qual a sua Altura?");

        double pesoEmQuilogramas = Double.parseDouble(peso);
        double alturaEmMetros = Double.parseDouble(altura);
        double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

        String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do Peso Ideal";
        msg = "IMC = " + imc + "\n" + msg;

        JOptionPane.showMessageDialog(null, msg);
    };

}