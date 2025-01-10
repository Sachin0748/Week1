// Create a class VolumeOfEarth to calculate the volume of Earth in km^3 and miles^3
public class VolumeOfEarth{
	public static void main(String[] args){
		
		// Create a variable radiusInKm to store radius of earth in km
		int radiusInKm = 6378;
		
		// Calculate the volume of Earth in cubic kilometers
        double volumeInKmCube = (4.0 / 3.0) * Math.PI * Math.pow(radiusInKm, 3);

        // Convert the radius to miles
        double radiusInMiles = radiusInKm * 0.621371;

        // Calculate the volume of Earth in cubic miles
        double volumeInMileCube = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);
		
		//Print the  volume of Earth in km^3 and miles^3
		System.out.print ("The volume of earth in cubic kilometers is " + volumeInKmCube + " and cubic miles is " + volumeInMileCube);
	}
}