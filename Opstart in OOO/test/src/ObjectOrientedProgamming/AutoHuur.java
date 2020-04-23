package ObjectOrientedProgamming;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public double Totaalprijs;

    public AutoHuur() {
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setHuurder(Klant klant) {
        this.huurder = klant;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public double totaalprijs(){

        this.Totaalprijs = this.aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1-huurder.getKortingsPercentage()/100);
        return Totaalprijs;   // TODO
    }

    @Override
    public String toString() {
        return "AutoHuur{" +
                "aantalDagen=" + aantalDagen +
                ", huurder=" + huurder +
                ", gehuurdeAuto=" + gehuurdeAuto +
                ", Totaalprijs=" + Totaalprijs +
                '}';
    }
}
