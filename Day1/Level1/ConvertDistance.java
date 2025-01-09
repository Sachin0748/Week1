// Create a class named as ConvertDistance to convert distance from kilometers into miles 

public class ConvertDistance{
	public static void main(String[] args){
		
		// Create a variable named as distanceInKilometer to store the distance in kilometers 
		double distanceInKilometer = 10.8;
		
		// Create a variable named as milesIn1Kilometer to store the distance in miles in 1 kilometer
		double milesIn1Kilometer = 1.6;
		
		//  Create a variable named as distanceInMiles to store the total distance in miles
		double distanceInMiles = distanceInKilometer * milesIn1Kilometer;
		
		// Print the total distance in miles
		System.out.println("The distance " + distanceInKilometer + " km in miles is " + distanceInMiles);
		}
}