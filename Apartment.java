/**
*This is a subclass of Residential class. This is lowest part of class hierarchy
* represents a more specific residential building that is an apartment
*
* @author Andrew Gordon
*
* Construction_ASG
* Fall/2021
*/
public class Apartment extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	//getters and Setters
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
	/**
	* The empty-argument constructor should initialize the instance
	variables
	*/

	public Apartment() {
		super();
		this.numRentableUnits=0;
		this.avgUnitSize=0;
		this.parkingAvailable= true;
		
		
		// TODO Auto-generated constructor stub
	}
	
	/**
	* 
	*
	*@param projectName the value of projectName based on calling Building method in Building class
	*@param completeAddress the value of completeAddress based on calling Building Method in Building class
	*@param totalSquareFeet the value of totalSquareFeet based on calling Building Method in Building class
	*@param subgroup the value of subgroup based on calling Building Method in Building class
	*@param occupancyGroup the value of occupancyGroup based on calling Building Method in Building class
	*@param numBedrooms the value of numBedrooms based on calling Residential Method in Residential class
	*@param  numBathrooms  the value of numBathrooms based on calling Residential Method in Residential class
	*@param  laundryroom the value of laundryroom based on calling Residential Method in Residential class
	**@param  numRentableUnits the value of numRentableUnits  based on calling Apartment Method in Apartment class
	**@param  avgUnitSize the value of avgUnitSize  based on calling Apartment Method in Apartment class
	**@param  parkingAvailable the value of parkingAvailable  based on calling Apartment Method in Apartment class
	*/
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String subgroup,
			String occupancyGroup, int numBedrooms, int numBathrooms, boolean laundryroom,int numRentableUnits,double avgUnitSize,boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, subgroup, occupancyGroup, numBedrooms, numBathrooms, laundryroom);
		// TODO Auto-generated constructor stub
		this.numRentableUnits=numRentableUnits;
		this.avgUnitSize=avgUnitSize;
		this.parkingAvailable=parkingAvailable;
	}
	
	public void draw() {
		System.out.println("\n Drawing code for "+this.getClass().getSimpleName());
	}//end draw method
	
	public String displaydata() {
	String s="";
		
	s+=super.toString()+"\nnumber of rentable units: "+numRentableUnits+"\nAverage Unit Size: "+avgUnitSize+"\nParking Available: "+parkingAvailable;
	return s;
	
	
	}//end displaydata
	
	
	
	
	
}//end class
