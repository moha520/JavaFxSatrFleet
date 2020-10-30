package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * 
 */

/**
 * @author kfi911
 *
 */
public class Users {
	
	private String username;
	private String passwd;
	private boolean grantAccess;
	ArrayList<Users>userList = new ArrayList<>();


    
	public Users () {}
	
	public Users(String username){
		this.username = username;
		
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the passwd
	 */
	public String getPasswd() {
		return passwd;
	}
	/**
	 * @param passwd the passwd to set
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	
	/**
	 * @return the grantAccess
	 */
	public boolean isGrantAccess() {
		return grantAccess;
	}

	/**
	 * @param grantAccess the grantAccess to set
	 */
	public void setGrantAccess(boolean grantAccess) {
		this.grantAccess = grantAccess;
	}

	public  Users validate(String userName,String passwd) throws IOException{
	String line = "";
	Users obj =new Users();
	try{
		BufferedReader userFile = new BufferedReader(new FileReader("data/users.csv"));
		while ((line = userFile.readLine()) != null){
			String[] value = line.split(",");
			if(value[0].equals(userName) && value[1].equals(passwd)){
				setGrantAccess(true);
				obj.setUsername(value[0]);
				break;
			}else
			{
				setGrantAccess(false);
			}
			
		}
		userFile.close();
		

	}catch(FileNotFoundException e){
		e.printStackTrace();
	}
	return obj;
	}
	



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getUsername();
	}
	
	
	

}
