import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String name;
    private ArrayList<Country> countries;

    public List<Continent> continents = new ArrayList<>();

    public Continent(){

    }

    //public Continent(List<Country> countries){
        //this.countries = countries;
    //}

    public Continent(String name, ArrayList<Country> countries){
        this.name = name;
        this.countries = countries;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public ArrayList<Country> getCountries(){
        return countries;
    }

    public void setName(String nm){
        name = nm;
    } 
}
