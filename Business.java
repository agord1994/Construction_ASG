/**
* This a child class of Building class.This is also superclass of Mall class.Middle of class hierarchy.
* This represents a more specific building that is a Business.
* 
*
* @author Andrew Gordon
*
* Construction_ASG
* Fall/2021
*/
public class Business extends Building {

	protected int numRentableUnits;

	
	//setters and getters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	/**
	* The empty-argument constructor should initialize the instance
	variables
	*/


	public Business() {
		super();
		this.numRentableUnits=0;
	}//end empty constructor

	/**
	* 
	*
	*@param projectName the value of projectName based on calling Building method in Building class
	*@param completeAddress the value of completeAddress based on calling Building Method in Building class
	*@param totalSquareFeet the value of totalSquareFeet based on calling Building Method in Building class
	*@param subgroup the value of subgroup based on calling Building Method in Building class
	*@param occupancyGroup the value of occupancyGroup based on calling Building Method in Building class
	**@param numRentableUnits the value of numRentableUnits based on calling Business method
	*/
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String subgroup,
			String occupancyGroup,int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, subgroup, occupancyGroup);
		 this.numRentableUnits=numRentableUnits;
	}//end preferred constructor
	
	
	public String toString() {
		return  super.displaydata() + "\nNumber of rentable units:" + numRentableUnits;
	}


	}//end class
