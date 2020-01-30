public class Test
{
    public static void main(String[] args) {
        Concessionario c1 = new Concessionario();
        Veicolo v1 = new Veicolo("CD234RF", "Mercedes", "AMG", 5);
        Veicolo v2 = new Veicolo("BF555RF", "BMW", "X5", 5);

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        c1.aggiungiVeicolo(v1);
        c1.aggiungiVeicolo(v2);

        c1.inventario();
    }
}
