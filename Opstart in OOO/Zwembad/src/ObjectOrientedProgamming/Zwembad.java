package ObjectOrientedProgamming;

public class Zwembad {

    public double Breedte;
    public double Lengte;
    public double Diepte;


    public Zwembad(double breedte, double lengte, double diepte) {
        Breedte = breedte;
        Lengte = lengte;
        Diepte = diepte;
    }

    public Zwembad() {
    }

    public double getBreedte() {
        return Breedte;
    }

    public double getLengte() {
        return Lengte;
    }

    public double getDiepte() {
        return Diepte;
    }

    public void setBreedte(double breedte) {
        Breedte = breedte;
    }

    public void setLengte(double lengte) {
        Lengte = lengte;
    }

    public void setDiepte(double diepte) {
        Diepte = diepte;
    }


    public double inhoud(){
        return Breedte * Lengte * Diepte;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + Breedte + " meter breed, " + Lengte + " meter lang, en " + Diepte + " meter diep";

    }
}
