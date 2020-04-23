package ObjectOrientedProgamming;
import java.util.ArrayList;
import java.util.List;

public class Team {

    private String naam;
    private List<Speler> spelerList = new ArrayList<>();
    private Trainer trainer;


    public Team(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }


    public void addSpeler(Speler speler){
        this.spelerList.add(speler);
    }

    public List<Speler> getSpelerList() {
        return spelerList;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Team: " + naam + '\'' +
                ", trainer=" + trainer +
                ", spelerList=" + spelerList;
    }




}
