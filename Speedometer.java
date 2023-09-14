public class Speedometer{

// My name is Soham Pati and a fun fact about me is that I play the violin


	public static void main(String[] Args){
		int kilometers = 50;
		double kmPerMile = 1.60934;
		double hours = .54;
		String name = "Soham";
		double miles = kilometers / kmPerMile;
		// for checking: System.out.println(miles);


		double milesTrunc = ((double)((int) (miles*1000))) / 1000;
		// for checking: System.out.println(milesTrunc);

		double speed = milesTrunc / hours;
		//System.out.println(speed);

		speed = ((double)((int) (speed*100))) / 100;

		//System.out.println(speed);


		System.out.println(name + " drove at a speed of " + speed + " mph for " + milesTrunc + " miles!");














	}








}