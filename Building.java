/**
* This superclass represents a building in class class hierarchy of Construction project. This is highest class in the hierarchy
* In this case, the class exists to show you how I expect you to comment
* 
*
* @author Andrew Gordon
*
* Construction_ASG
* Fall/2021
*/
public class Building {
 
	
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String subgroup;
	protected String occupancyGroup;
	
	
	/**
	* The empty-argument constructor should initialize the instance variables
	*/

	public Building() {
	 this.completeAddress="";
	this.occupancyGroup="";
	this.subgroup="";
	this.totalSquareFeet=0.0;
	this.occupancyGroup="";
	
	}//end empty argument constructor

	/**
	* 
	*
	* @param projectName the value of projectName based on calling Building method
	* @param completeAddress the value of completAdress based on calling Building Method
	*@param totalSquareFeet the value of totalSquareFeet based on calling Building Method
	*@param subgroup the value of subgroup based on calling Building Method
	**@param occupancyGroup the value of occupancyGroup based on calling Building Method
	*/
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String subgroup,
			String occupancyGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.subgroup = subgroup;
		this.occupancyGroup = occupancyGroup;
	}//end prefered argument constructor






	//Getters and Setters
	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public String getCompleteAddress() {
		return completeAddress;
	}



	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}



	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}



	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}



	public String getSubgroup() {
		return subgroup;
	}



	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}



	public String getOccupancyGroup() {
		return occupancyGroup;
	}



	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

///End Setters and Getters
	/**
	* The draw() method should print the objects from java object class
	* .getclass returns the class 
	* .getSimpleName returns the simple name of the underlying class.
	*/

	public void draw() {
		System.out.println("\n Drawing code for "+this.getClass().getSimpleName());
	}//end draw method
	
	/**
	*return the value s and print
	*/
	
	public String displaydata() {
	String s="";
	s+=("\n"+"Project Name: "+projectName+"\nAddress: "+completeAddress+"\nSquare Feet: "+totalSquareFeet+"\nOccupancy Group: "+occupancyGroup+"\nOccupancy Subgroup: "+subgroup);
	return s;	
	}
	
	
}// end class
