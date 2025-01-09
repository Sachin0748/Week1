// Create a class DistributePen to distribute the pen equally 
public class DistributePen{
	public static void main(String[] args){
		
		// Create a variable totalPens to store total number of pens
		int totalPens = 14;
		
		// Create a variable totalStudents to store total number of Students
		int totalStudents = 3;
		
		// Create a variable penToEachStudent to store total number of pen each student get
		int penToEachStudent = totalPens / totalStudents;
		
		// Create a variable remainingPen to store total number of pens left
		int remainingPen = totalPens % totalStudents;
		
		//Print pen per student and remaining pen
		System.out.print("The Pen Per Student is " + penToEachStudent + " and the remaining pen not distributed is " + remainingPen);
	}
}