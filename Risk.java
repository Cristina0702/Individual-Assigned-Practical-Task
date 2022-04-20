import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Random;

import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.NumberFormatException;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Risk {
    private String[] countriesArray;
    private String[] adjacenciesArray;
    private String line;
    private String input;
    
    private ArrayList<Country> countries;
    private ArrayList<Country> priorityCountries;
    private ArrayList<Country> priorityTargets;

      
    private Country countryA;
    private Country countryB;

    private StringBuilder stringBuilder;
	  private BufferedReader reader;

    protected Risk() {
	
    }
    
    protected void saveGame() {
    
    }

    protected void quitGame() {
      System.exit(0);
    }

    public void hi()throws FileNotFoundException{
    
      try{
        // Reads adjacencies file
        reader = new BufferedReader(new FileReader("adjacencent_countries.txt"));			
        stringBuilder = new StringBuilder();
        
        while((line = reader.readLine()) != null) {
          stringBuilder.append(line);
        }
        input = stringBuilder.toString();
        
        // Creates an array of each line from the file
        adjacenciesArray = input.split("\t");
      } catch (FileNotFoundException error) {
        System.out.println(error.getMessage());
      } catch (IOException error) {
        System.out.println(error.getMessage());
      }
  }
  
}
