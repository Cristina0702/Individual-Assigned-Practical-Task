import java.util.ArrayList;

public class Country{
    private String name;
    private ArrayList<Country> adjacent_countries;

    //public ArrayList<Country> countries;

    public Country(){

    }

    public Country(String name){
        this.name = name;
    }

    public void add_adjacent_counties(ArrayList<Country> adjacent_countries){
        this.adjacent_countries = adjacent_countries;
    }

    public String getName(){
        return name;
    }

    public void setName(String nm){
        name = nm;
    }
}