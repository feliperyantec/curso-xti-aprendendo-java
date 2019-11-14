public class CachorroTest {

    public static void main(String[] args) {
        
        Cachorro pitBull = new Cachorro();
        pitBull.Raca = "Pit Bull";
        pitBull.tamanho = 50;
        pitBull.latir();

        Cachorro viraLata = new Cachorro();
        viraLata.Raca = "Vira Lata";
        viraLata.tamanho = 30;
        viraLata.latir();
    }
}