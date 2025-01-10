import java.util.Scanner;

// Create TravelComputation Class to compute the Distance and Travel Time
class TravelComputation {
   
   public static void main(String[] args) {

      // Create a Scanner object to take user input
      Scanner input = new Scanner(System.in);
      
      // Enter the person's name
      System.out.print("Enter the name of the traveler: ");
      String name = input.nextLine();
      
      // Enter the cities for the travel
      System.out.print("Enter the starting city: ");
      String fromCity = input.nextLine();
      
      System.out.print("Enter the via city: ");
      String viaCity = input.nextLine();
      
      System.out.print("Enter the destination city: ");
      String toCity = input.nextLine();

      // Enter the distance from fromCity to viaCity
      System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in km: ");
      double distanceFromToVia = input.nextDouble();

      // Enter the time taken from fromCity to viaCity (in minutes)
      System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: ");
      int timeFromToVia = input.nextInt();

      // Enter the distance from viaCity to toCity
      System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in km: ");
      double distanceViaToFinalCity = input.nextDouble();

      // Enter the time taken from viaCity to toCity (in minutes)
      System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: ");
      int timeViaToFinalCity = input.nextInt();

      // Calculate the total distance and total time
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Print the travel details
      System.out.println("\nThe Total Distance traveled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");

      // Close the scanner
      input.close();
   }
}
