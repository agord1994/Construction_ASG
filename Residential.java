/**
* This a child class of Building class. Also is a parent class of both Apartment and SingleFamilyHome. Middle of class hierarchy.
* This represents a more specific Building that is a Residential.
* your code.
*
* @author Andrew Gordon
*
* Construction_ASG
* Fall/2021
*/
public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	//setters and getters
	
	public int getNumBedrooms() {
		return numBedrooms;
	}
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	public int getNumBathrooms() {
		return numBathrooms;
	}
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	public boolean isLaundryRoom() {
		return laundryRoom;
	}
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	/**
	* 
	*
	*@param projectName the value of projectName based on calling Building method in Building class
	*@param completeAddress the value of completeAddress based on calling Building Method in Building class
	*@param totalSquareFeet the value of totalSquareFeet based on calling Building Method in Building class
	*@param subgroup the value of subgroup based on calling Building Method in Building class
	*@param occupancyGroup the value of occupancyGroup based on calling Building Method in Building class
	**@param numBedrooms the value of numBedrooms based on calling Residential Method 
	**@param  numBathrooms  the value of numBathrooms based on calling Residential Method 
	**@param  laundryroom the value of laundryroom based on calling Residential Method 
	*/
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String subgroup,
			String occupancyGroup,int numBedrooms,int numBathrooms,boolean laundryroom) {
		super(projectName, completeAddress, totalSquareFeet, subgroup, occupancyGroup);
			this.numBedrooms=numBedrooms;
			this.numBathrooms=numBathrooms;
			this.laundryRoom=laundryroom;
		
		// TODO Auto-generated preferred constructor stub
	}
	/**
	* The empty-argument constructor should initialize the instance
	variables
	*/

	public Residential() {
		super();
		this.numBedrooms=0;
		this.numBathrooms=0;
		this.laundryRoom=true;
		
		
		
		// TODO Auto-generated empty constructor stub
	}
	
	
	@Override
	public String toString() {
		return  super.displaydata() + "\n number of bedrooms: " + numBedrooms+"\n number of bathrooms: "+numBathrooms+"\n laundry: "+laundryRoom;
	}
	
	
	
	
	
	
	
}//end class
