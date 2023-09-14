public class GroceryShopping{
	public static void main(String[] Args){

		double bananaCost = 3.99;
		double applesCost = 1.25;
		int numApples = 4;

		double couponValue = .53;
		double taxRate = .08;
		double orderTotal = 0.0;

		orderTotal += (bananaCost/2);

		orderTotal += (applesCost*numApples);

		orderTotal -= (3 * couponValue);

		orderTotal *= (1.0 + taxRate);
		//System.out.println(orderTotal);

		double orderTotalTrunc = (double)(int)(orderTotal*100) / 100;
		//System.out.println(orderTotalTrunc);

		System.out.println("Your order total is $" + orderTotalTrunc + ".");

		int dollars = 10;
		dollars -= orderTotalTrunc;
		System.out.println("You have " + dollars + " dollar bills remaining.");



	}


}