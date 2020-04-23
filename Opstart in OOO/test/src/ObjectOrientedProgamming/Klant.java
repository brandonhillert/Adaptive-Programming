package ObjectOrientedProgamming;
public class Klant {

    private String naam;
    private double kortingsPercentage;

    public Klant(String naam) {
        this.naam = naam;
    }

    public double getKortingsPercentage() {
        return kortingsPercentage;
    }

    public void setKortingsPercentage(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", kortingsPercentage=" + kortingsPercentage +
                '}';
    }
}
