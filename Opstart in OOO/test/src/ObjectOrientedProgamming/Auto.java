package ObjectOrientedProgamming;

public class Auto {

    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "type='" + type + '\'' +
                ", prijsPerDag=" + prijsPerDag +
                '}';
    }
}
