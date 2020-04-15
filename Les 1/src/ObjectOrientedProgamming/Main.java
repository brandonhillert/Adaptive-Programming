package ObjectOrientedProgamming;

public class Main {

    public static void main(String[] args) {


        Auto merrie = new Auto("V8");

        merrie.setMerk("Mercedes");
        merrie.setType("AMG");
        merrie.setKleur("Zwart");
        merrie.setSnelheid(300);
        merrie.getTest();



        System.out.println(merrie.getTest());
        System.out.println(merrie.merk + " "+ merrie.type + " " + merrie.snelheid +" "+  merrie.kleur);

    }
}
