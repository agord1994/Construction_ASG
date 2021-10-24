/**
*This is a driver class of the Construction project. Used to test every object and and to test every constructor/method/getter/setter/toString
* Moves from more general to more specific
*
* @author Andrew Gordon
*
* Construction_ASG
* Fall/2021
*/
public class Application {

	
	public static void main(String[] args) {
		//building test empty constructor
		System.out.println("\n++++++++++++++++Building empty Argument Constructor Test++++++++++++++++");
		Building b0=new Building();
		System.out.printf(b0.displaydata());
		
		//building test setters and getters
		System.out.println("\n++++++++++++++++Building empty setter&getter Test++++++++++++++++");
		b0.setProjectName("Tom's thrift store");
		b0.setCompleteAddress("111 wood dr.");
		b0.setTotalSquareFeet(1000);
		b0.setOccupancyGroup("Business");
		b0.setSubgroup("B");
		
		System.out.println(b0.getProjectName()+b0.getCompleteAddress()+b0.getTotalSquareFeet()+b0.getOccupancyGroup()+b0.getSubgroup());
		
		//building test draw method
		System.out.println("\n++++++++++++++++Building draw method Test++++++++++++++++");
				
		b0.draw();
				
		//building test preferred constructor with displaydata method 
		System.out.println("\n++++++++++++++++Building Preferred Constructor Test++++++++++++++++");
		Building b1=new Building("Tom's thrift store","111 wood dr.",1000,"Business","B");

		System.out.printf(b1.displaydata());
		
	
		
		//Business empty constructor test
		System.out.println("\n++++++++++++++++Business empty Constructor Test++++++++++++++++");
		Business bus0=new Business();
		System.out.printf(bus0.toString());
		
		
		//Business setter and getter test
		System.out.println("\n++++++++++++++++Business setter and getter Test++++++++++++++++");
		bus0.setProjectName("Ford's printing");
		bus0.setCompleteAddress("3456 Thomas Lane");
		bus0.setTotalSquareFeet(2000);
		bus0.setOccupancyGroup("Business");
		bus0.setSubgroup("B");
		bus0.setNumRentableUnits(2);
		
		System.out.println(bus0.getProjectName()+bus0.getCompleteAddress()+bus0.getTotalSquareFeet()+bus0.getOccupancyGroup()+bus0.getSubgroup()+bus0.getNumRentableUnits());
		//business draw method test
		System.out.println("\n++++++++++++++++Business draw method Test++++++++++++++++");
		
		bus0.draw();
		
		
		
		//building test preferred constructor with toString method 
		Business bus1=new Business("Ford's printing","3456 Thomas Lane",2000,"Business","B",2);
		
		System.out.println("\n++++++++++++++++Business Preferred Constrctor Test++++++++++++++++");
	
		
		
		System.out.println(bus1.toString());
	
		
		
		//Residential test empty constructor
		System.out.println("\n++++++++++++++++Residential empty Argument Constructor Test++++++++++++++++");
		Residential res0=new Residential();
		System.out.printf(res0.toString());
		
		//Residential setter and getter test
		System.out.println("\n++++++++++++++++Residential setter and getter Test++++++++++++++++");
		res0.setProjectName("The Meadows Motel");
		res0.setCompleteAddress("Rose Rd.");
		res0.setTotalSquareFeet(30000);
		res0.setOccupancyGroup("Residential");
		res0.setSubgroup("R-1");
		res0.setNumBedrooms(20);
		res0.setNumBathrooms(20);
		res0.setLaundryRoom(true);
		
		System.out.println(res0.getProjectName()+res0.getCompleteAddress()+res0.getTotalSquareFeet()+res0.getOccupancyGroup()+res0.getSubgroup()+res0.getNumBedrooms()+res0.getNumBathrooms()+res0.isLaundryRoom());
		
		//Residential test draw method
		System.out.println("\n++++++++++++++++Residential draw method Test++++++++++++++++");
						
		res0.draw();
		
		//Residential preferred constructor test with toString method
		Residential res1=new Residential("The Meadows Motel","Rose Rd.",30000,"Residential","R-1",20,20,true);
		
		System.out.println("\n++++++++++++++++Residential++++++++++++++++");
		
		System.out.println(res1.toString());
	
		
		
		//Mall empty constructor test
		System.out.println("\n++++++++++++++++Mall empty Constructor Test++++++++++++++++");
		Mall mall0=new Mall();
		System.out.printf(mall0.displaydata());
		
		
		//Mall setter and getter test
		System.out.println("\n++++++++++++++++Mall setter and getter Test++++++++++++++++");
		mall0.setProjectName("Oxmoor Mall");
		mall0.setCompleteAddress("384 Gallagher Rd");
		mall0.setTotalSquareFeet(50000);
		mall0.setOccupancyGroup("Business");
		mall0.setSubgroup("B");
		mall0.setNumRentableUnits(35);
		mall0.setNumRentedUnits(25);
		mall0.setMedianUnitSize(3000);
		mall0.setNumParkingSpaces(100);
		
		
		
		System.out.println(mall0.getProjectName()+mall0.getCompleteAddress()+mall0.getTotalSquareFeet()+mall0.getOccupancyGroup()+mall0.getSubgroup()+mall0.getNumRentableUnits()+mall0.getNumRentedUnits()+mall0.getMedianUnitSize()+mall0.getNumParkingSpaces());
		
		//Mall draw method test
		System.out.println("\n++++++++++++++++Business draw method Test++++++++++++++++");
				
		mall0.draw();
		
		
		
		//Mall preferred constructor test with displaydata method 
		Mall mall1=new Mall("Oxmoor Mall","384 Gallagher Rd",50000,"Business","B",35, 25, 3000, 100);
		
		System.out.println("\n++++++++++++++++Mall++++++++++++++++");
		
		
		System.out.println(mall1.displaydata());
	
		
		
		//Apartment test empty constructor
		System.out.println("\n++++++++++++++++Apartment empty Argument Constructor Test++++++++++++++++");
		Apartment apart0=new Apartment();
		System.out.printf(apart0.toString());
		
		//Apartment setter and getter test
		System.out.println("\n++++++++++++++++Apartment setter and getter Test++++++++++++++++");
		apart0.setProjectName("Copperstone Apartments");
		apart0.setCompleteAddress("1716 Tulane Rd.");
		apart0.setTotalSquareFeet(60000);
		apart0.setOccupancyGroup("Residential");
		apart0.setSubgroup("R-1");
		apart0.setNumBedrooms(100);
		apart0.setNumBathrooms(100);
		apart0.setLaundryRoom(true);
		apart0.setNumRentableUnits(75);
		apart0.setAvgUnitSize(1250);
		apart0.setParkingAvailable(true);
		
		System.out.println(apart0.getProjectName()+apart0.getCompleteAddress()+apart0.getTotalSquareFeet()+apart0.getOccupancyGroup()+apart0.getSubgroup()+apart0.getNumBedrooms()+apart0.getNumBathrooms()+apart0.isLaundryRoom()+apart0.getNumRentableUnits()+apart0.getAvgUnitSize()+apart0.isParkingAvailable());
		
		//Apartment test draw method
		System.out.println("\n++++++++++++++++Apartment draw method Test++++++++++++++++");
						
		apart0.draw();

		
		//Apartment test preferred Constuctor Test
		
		Apartment apart1=new Apartment("Copperstone Apartments","1716 Tulane Rd.",60000,"Residential","R-1",100,100,true,75,1250,true);
		
		System.out.println("\n++++++++++++++++Apartment++++++++++++++++");
	
		System.out.println(apart1.displaydata());
		
		
		
		
		//SingleFamilyHome test empty constructor
		System.out.println("\n++++++++++++++++SingleFamilyHome empty Argument Constructor Test++++++++++++++++");
		SingleFamilyHome sFH0=new SingleFamilyHome();
		System.out.printf(sFH0.displaydata());
		
		//SingleFamilyHome setter and getter test
		System.out.println("\n++++++++++++++++SingleFamilyHome setter and getter Test++++++++++++++++");
		sFH0.setProjectName("Gaines House");
		sFH0.setCompleteAddress("123 Main Street Louisville Kentucky 40201");
		sFH0.setTotalSquareFeet(2540);
		sFH0.setOccupancyGroup("Residential");
		sFH0.setSubgroup("R-1");
		sFH0.setNumBedrooms(4);
		sFH0.setNumBathrooms(3);
		sFH0.setLaundryRoom(true);
		sFH0.setGarage(true);
		
		System.out.println(sFH0.getProjectName()+sFH0.getCompleteAddress()+sFH0.getTotalSquareFeet()+sFH0.getOccupancyGroup()+sFH0.getSubgroup()+sFH0.getNumBedrooms()+sFH0.getNumBathrooms()+sFH0.isLaundryRoom()+sFH0.isGarage());
		
		//SingleFamilyHome test draw method
		System.out.println("\n++++++++++++++++SingleFamilyHome draw method Test++++++++++++++++");
						
		sFH0.draw();
		
		
		//Single Family Home preferred constructor test
		SingleFamilyHome sFH1=new SingleFamilyHome("Gaines House","123 Main Street Louisville Kentucky 40201",2540,"Residential","R-1",4,3,true,true);
		
		System.out.println("\n++++++++++++++++Single Family Home++++++++++++++++");
		
		System.out.println(sFH1.displaydata());
		
		
		
	}//end main method
}//end class
