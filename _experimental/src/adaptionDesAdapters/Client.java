package adaptionDesAdapters;

/**
 * Created by Cronixx on 06.09.2016.
 *
 * This one wants something
 */
public class Client {

    private boolean isSatisfied = false;
    private Produkt erhaltenesProdukt;

    public Client() {}

    public void gibKundeProdukt(Produkt produkt) {
        System.out.println("Der Kunde erhält das Produkt");
        this.erhaltenesProdukt = produkt;
    }

    public boolean lasseKundenPruefen() {
        System.out.println("Kunde erhält Produkt mit Wert: " + erhaltenesProdukt.iCanDoSomething());
        if(erhaltenesProdukt.iCanDoSomething() == 42) this.isSatisfied = true;
        if((erhaltenesProdukt.iCanDoSomething() == 666) || (erhaltenesProdukt.iCanDoSomething() == 88)) {
            this.isSatisfied = false;
            System.out.println("Der Kunde ist jetzt traurig du scheiß Nazi");
        }
        System.out.println("Der kunde ist: " + this.isSatisfied);
        return this.isSatisfied;
    }
}
