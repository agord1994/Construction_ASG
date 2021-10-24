
/**
*This is a subclass of Residential class. This is lowest part of class hierarchy
* represents a more specific residential building that is an apartment
*
* @author Andrew Gordon
*
* Construction_ASG
* Fall/2021
*/


public class SingleFamilyHome extends Residential {
	
	private boolean garage;

	
	//getters and setters
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	
	/**
	* The empty-argument constructor should initialize the instance
	variables
	*/
	
	public SingleFamilyHome() {
		super();
		this.garage=true;
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
	**@param garage the value of garage based on calling SingleFamilyHome Method 
	*/
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String subgroup,
			String occupancyGroup, int numBedrooms, int numBathrooms, boolean laundryroom,boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, subgroup, occupancyGroup, numBedrooms, numBathrooms, laundryroom);
		// TODO Auto-generated constructor stub
		this.garage=garage;
	}

	public void draw() {
		System.out.println("\n Drawing code for "+this.getClass().getSimpleName());
	}//end draw method
	
	
	public String displaydata() {
	String s="";
		
	s+=super.toString()+"\nGarage: "+garage;
	return s;
	
	
	}//end displaydata
	

}//end class
