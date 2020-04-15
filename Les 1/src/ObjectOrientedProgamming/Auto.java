package ObjectOrientedProgamming;

public class Auto {

    public String kleur;
    public String merk;
    public String type;
    public int snelheid;


    //Constructor
    public Auto(String test){
        this.kleur = "Blauw";
    }



    //Set de waarde van een attribuut
    public void setMerk(String merk) { this.merk = merk; }

    public void setType(String type) { this.type = type; }

    public void setSnelheid(int snelheid){ this.snelheid = snelheid; }

    public void setKleur(String kleur) { this.kleur = kleur; }



    public String getTest() { return kleur; }



}
