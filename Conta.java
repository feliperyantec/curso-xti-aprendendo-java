public class Conta {

    String cliente;
    double saldo;

    void exibeSaldo(){
        System.out.println(cliente + " Seu Saldo é de " + saldo);
    }
    void saca(double valor){
        saldo -= valor;
    }
    void deposita(double valor){
        saldo += valor;
    }
    void transferePara(Conta destino, double valor){
        this.saca(valor);
        destino.deposita(valor);
    }
}