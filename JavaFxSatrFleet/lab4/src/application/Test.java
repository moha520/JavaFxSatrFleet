package application;

import java.io.IOException;

import model.CrewMember;
import model.Fleet;
import model.ImageList;
import model.Starship;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Starship st = new Starship();
//		Fleet fleet = new Fleet();
//		CrewMember crew = new CrewMember();
//		
//		fleet.loadStarship("data/fleet.csv");
//		fleet.loadCrew("data/personnel.csv");
//		fleet.setName("Enterprise");
//		fleet.getList();
		 
		ImageList img = new ImageList();
		try {
			img.loadImg();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
