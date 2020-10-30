/**
 * 
 */
package model;
import java.util.ArrayList;

/**
 * @author Hassan Ali
 * kfi911
 *
 */
public class Starship {
	private String name;
	private String registry;
	private String starClass;
    private ArrayList<CrewMember>crewList = new ArrayList<>();
   /**
    * Constructor to set the variables
    * @param name
    * @param registry
    * @param starClass
    */
    public Starship(String name,String registry, String starClass){
    	this.setName(name);
    	this.setRegistry(registry);
    	this.setStarClass(starClass);
    }
/**
 * noArgs default constructor
 */
	public Starship() {
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the registry
	 */
	public String getRegistry() {
		return registry;
	}

	/**
	 * @return the starClass
	 */
	public String getStarClass() {
		return starClass;
	}

	/**
	 * @return the crewList
	 */
	public ArrayList<CrewMember> getCrewList() {
		return crewList;
	}

	/**
	 * @param crewList the crewList to set
	 */
	public void setCrewList(ArrayList<CrewMember> crewList) {
		this.crewList = crewList;
	}

	/**
	 * @param starClass the starClass to set
	 */
	public void setStarClass(String starClass) {
		this.starClass = starClass;
	}

	/**
	 * @param registry the registry to set
	 */
	public void setRegistry(String registry) {
		this.registry = registry;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * adds the list of crew members into an array list
	 * @param crew
	 */
	public void addCrewMember(CrewMember crew){
		getCrewList().add(crew);
		
	}

	/**
	 * toString method to return methods in a string format
	 */
	@Override
	public String toString() {
		return  getName() + " " + getRegistry() + " "
				+ getStarClass() + " " + getCrewList() ;
	}
    
}
