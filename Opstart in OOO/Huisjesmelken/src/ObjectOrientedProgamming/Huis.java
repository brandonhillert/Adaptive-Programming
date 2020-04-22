package ObjectOrientedProgamming;

public class Huis {

    private String adres;
    private int bouwjaar;
    public Persoon huisbaas;


    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }


    @Override
    public String toString() {
        return "Huis " + adres + "is gebouwd in " + bouwjaar + " en heeft huisbaas " + huisbaas;
    }










}
