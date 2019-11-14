public class ContaTest{

    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.cliente = "Felipe";
        conta.saldo = 10000.00;
        conta.exibeSaldo();

        Conta destino = new Conta();
        destino.cliente = "Dherky";
        destino.saldo = 5000.00;
        destino.exibeSaldo();

        conta.transferePara(destino, 2000.00);
        conta.exibeSaldo();
        destino.exibeSaldo();
    }
}