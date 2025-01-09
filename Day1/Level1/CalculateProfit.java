// Create a class CalculateProfit to calculate profit and profit percentage
public class CalculateProfit{
	public static void main(String[] args){
		
		// Create variables named as costPrice to store cost price
		int costPrice = 129;
			
		// Create variables named as sellingPrice to store selling price
		int sellingPrice = 191;
		
		// Create variable profit to calculate profit
		int profit = sellingPrice - costPrice;
		
		// Create a variable profitPercentage to calculate profit percentage 
		double profitPercentage = (double)profit / costPrice * 100;
		
		//Print profit and profit percentage
		System.out.print("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}