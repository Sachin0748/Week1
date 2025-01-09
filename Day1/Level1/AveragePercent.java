// Create a AveragePercent class to calculate the average percent mark in PCM

public class AveragePercent{
	public static void main(String[] args){
		
		// Create variable named as maths, physics, chemistry for storing marks
		
		int maths = 94, physics = 96, chemistry = 96; 
		
		// Create a variable result to calculate the average percent mark
		double result = (double)(maths + physics + chemistry) / 3;
		
		// Print the average percent mark
		System.out.println("Sam's average mark in PCM is " + result);
	}
}