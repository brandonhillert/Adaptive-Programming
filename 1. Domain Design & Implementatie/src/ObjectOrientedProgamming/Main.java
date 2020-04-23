package ObjectOrientedProgamming;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Voetbalclub ajax = new Voetbalclub();

        ajax.setNaam("AFC Ajax");
        System.out.println(ajax.getNaam());



        Team team = new Team("A1");
        Speler sp1 = new Speler("Jan","Vertongen", 4);
        Speler sp2 = new Speler("Lasse","Schöne", 7);
        Speler sp3 = new Speler("Viktor","Fischer", 9);
        Speler sp4 = new Speler("Hakim","Ziyech", 10);
        Speler sp5 = new Speler("Jasper","Cillisen", 1);

        team.addSpeler(sp1);
        team.addSpeler(sp2);
        team.addSpeler(sp3);
        team.addSpeler(sp4);
        team.addSpeler(sp5);


        Trainer a1 = new Trainer();
        a1.setVoornaam("Frank ");
        a1.setAchternaam("De boer");


        team.setTrainer(a1);

        System.out.println(team);
        ajax.addTeams(team);

        System.out.println(ajax);
















    }
}
