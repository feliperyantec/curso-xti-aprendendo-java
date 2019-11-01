import javax.swing.JOptionPane;

/**
 * 
 */

 public class EntradaGraficaDeDadosComJOptionPane {

        public static void main(String[] args) {
            
            String nome = JOptionPane.showInputDialog("Qual o seu nome?");
            JOptionPane.showMessageDialog(null, "Bem Vindo(a): " + nome);

        }
 }