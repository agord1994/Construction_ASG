/**
* This is a subclass of Business class. This is lowest part of class hierarchy
* represents a more specific business building that is a mall
* 
*
* @author Andrew Gordon
*
* Construction_ASG
* Fall/2021
*/
public class Mall extends Business {

private int numRentedUnits;
private double medianUnitSize;
private int numParkingSpaces;

//getters and setters

public int getNumRentedUnits() {
	return numRentedUnits;
}
public void setNumRentedUnits(int numRentedUnits) {
	this.numRentedUnits = numRentedUnits;
}
public double getMedianUnitSize() {
	return medianUnitSize;
}
public void setMedianUnitSize(double medianUnitSize) {
	this.medianUnitSize = medianUnitSize;
}
public int getNumParkingSpaces() {
	return numParkingSpaces;
}
public void setNumParkingSpaces(int numParkingSpaces) {
	this.numParkingSpaces = numParkingSpaces;
}
/**
* The empty-argument constructor should initialize the instance
variables
*/

public Mall() {
	super();
	this.numRentedUnits=0;
	this.medianUnitSize=0;
	this.numParkingSpaces=0;
	// TODO Auto-generated constructor stub
}//end empty arguument constructor

/**
* 
*
*@param projectName the value of projectName based on calling Building method in Building class
*@param completeAddress the value of completeAddress based on calling Building Method in Building class
*@param totalSquareFeet the value of totalSquareFeet based on calling Building Method in Building class
*@param subgroup the value of subgroup based on calling Building Method in Building class
*@param occupancyGroup the value of occupancyGroup based on calling Building Method in Building class
*@param numRentableUnits the value of numRentableUnits based on calling Business method in Business class
**@param numRentedUnits the value of numRentedUnits based on calling Mall method
**@param medianUnitSize the value of medianUnitSize based on calling Mall method
**@param numParkingSpaces the value of numParkingSpaces based on calling Mall method
*/

public Mall(String projectName, String completeAddress, double totalSquareFeet, String subgroup, String occupancyGroup,
		int numRentableUnits,int numRentedUnits,double medianUnitSize,int numParkingSpaces) {
	super(projectName, completeAddress, totalSquareFeet, subgroup, occupancyGroup, numRentableUnits);
	
	this.numRentedUnits=numRentedUnits;
	this.medianUnitSize=medianUnitSize;
	this.numParkingSpaces=numParkingSpaces;
	
	// TODO Auto-generated constructor stub
}//end preferred constructor

public void draw() {
	System.out.println("\n Drawing code for "+this.getClass().getSimpleName());
}//end draw method


public String displaydata() {
	String s="";
	s+=super.toString()+"\n number of rented units: "+numRentedUnits+"\n median unit size: "+medianUnitSize+"\n number of parking spaces: "+numParkingSpaces; 
	return s;
	
}
	
	
	
	
}//end class
