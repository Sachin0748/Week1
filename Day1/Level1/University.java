// Create a class University to calculate the discount amount and discounted price
public class University{
	public static void main(String[] args){
		
		// Create a variable fee to store university fee for the course
		int fee = 125000;
		
		// Create a variable discountPercent  to store discount percent
		int discountPercent = 10;
		
		// Create a variable discount to compute discount
		int discount = fee * discountPercent / 100;
		
		// Create a variable discountedFee to compute fee student have to pay
		int discountedFee = fee - discount;
		
		//Print the discount amount and discounted price
		System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}