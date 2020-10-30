/**
 * 
 */
package model;



import java.io.File;

import java.io.IOException;

import java.util.ArrayList;





/**
 * @author Hassan Ali  kfi911
 *
 */
public class ImageList {
	
	
	public ArrayList<File>imageList =  new ArrayList<>();
	
	
	
	
	public void loadImg() throws IOException{
	
		  String dirPath = "images/images";
	        File dir = new File(dirPath);
	     

	            for (File aFile : dir.listFiles() ) {
					imageList.add(aFile);	            	 
	            }
	            
	}
	
	
	

}
