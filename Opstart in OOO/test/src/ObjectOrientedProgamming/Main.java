package ObjectOrientedProgamming;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Autohuur opdracht
        /*
        Notities, ik heb geen idee hoe ik de totaalprijs automatisch laat berekenen binnen de klas, de functie werkt wel
         */
        AutoHuur ah1 = new AutoHuur();
        System.out.println("Eerste autohuur: " +ah1.toString());
        Klant k1 = new Klant("Mijnheer de Vries");
        k1.setKortingsPercentage(10.0);
        ah1.setHuurder(k1);
        System.out.println("Eerste autohuur: " + ah1.toString());

        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur: " + ah1.toString());

        //System.out.println(ah1.totaalprijs());

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k1);
        ah2.setAantalDagen(1);
        System.out.println("Tweede autohuur: "+ah2.toString());

        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());


    }
}
