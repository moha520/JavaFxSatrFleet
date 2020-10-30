/**
 * 
 */
package model;

/**
 * @author kfi911
 *
 */
public class CrewMember {
	private String name;
	private String position;
	private String rank;
	private String species;
	
	public CrewMember(String name, String position, String rank,String species){
		this.setName(name);
		this.setPosition(position);
		this.setRank(rank);
		this.setSpecies(species);
		
	}

	public CrewMember() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the position variable
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @return the rank variable
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @return the species variable
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * it sets the species variable
	 * @param species 
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * sets the rank variable
	 * @param rank 
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/**
	 * sets the position variable
	 * @param position 
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * sets the name variable
	 * @param name 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return string representation of CrewMember object
	 */
	@Override
	public String toString() {
		return  getName() ;}
				
	
	

}
