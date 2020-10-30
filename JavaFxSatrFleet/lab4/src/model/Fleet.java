/**
 * 
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * @author Hassan Ali  
 * kfi911
 *
 */
public class Fleet {
	
	private String name;
	private ArrayList<Starship>starship = new ArrayList<>();
	private Starship starshp = new Starship();
	/**
	 * Constructor initializes the name of the fleet
	 * @param name
	 */
	public Fleet(String name){
		this.name = name;
	}
	/**
	 * Default no arg  constructor
	 */
	public Fleet() {
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * set the name
	 * @param name 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the name of a star ship
	 */
	public ArrayList<Starship> getStarship() {
		return starship;
	}
	/**
	 * @param starship the star ship to set
	 * sets the list of star ship
	 */
	public void setStarship(ArrayList<Starship> starship) {
		this.starship = starship;
	}
	/**
	 * read from fleet.csv file and save it into ArrayList
	 * @param filename
	 */
	public void loadStarship(String filename) {
		String line = "";
		try {
			BufferedReader starShipFile = new BufferedReader(new FileReader(filename));
			while ((line = starShipFile.readLine()) != null) {
				
				String[] value = line.split(",");
				
				getStarship().add(new Starship(value[0],value[1],value[2]));
			}
	
			starShipFile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	/**
	 * 
	 * read from personnel.csv file and save it into ArrayList
	 * @param filename
	 */
	public void loadCrew(String filename) {
		String line = "";
		try {
			BufferedReader crewFile = new BufferedReader(new FileReader(filename));
			while ((line = crewFile.readLine()) != null) {
				
				String[] value = line.split(",");
				
				starshp.addCrewMember(new CrewMember(value[0],value[1],value[2],value[3]));
			}
	
			crewFile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	/**
	 * 
	 * @return a string of formatted output read from a file
	 */
	public String getList(){
		StringBuilder sb = new StringBuilder("no ship of that name could be found.");
		
		for(int i=0; i<getStarship().size();i++){
			if(getStarship().get(i).getName().equalsIgnoreCase("USS"+" "+getName())){
				
			sb.append("\n"+ getStarship().get(i).getName() +" "+ getStarship().get(i).getRegistry()+" "
					+ getStarship().get(i).getStarClass() + " \n");
			for(int j=0;j< starshp.getCrewList().size();j++){
				System.out.println(starshp.getCrewList().get(j));
				sb.append("");
				//sb.append("\t - "+starshp.getCrewList().get(j) +"\n");
				}
			}
			
		}
		if(sb.length() > 36){
			sb.delete(0, 37);
		}
		
		return sb.toString();
	}
	/* *
	 * return the list of the fleet in string format
	 * from reading from a file
	 */
	@Override
	public String toString() {
		return  getList();
	}
	
	
	

}
