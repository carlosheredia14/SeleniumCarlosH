package Ejercicios;


public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		toMilesPerHour(10.25);
		printConversion(1.5);
	}

	
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			System.out.println(-1);
			return -1;
		} else {
			double x= Math.round(kilometersPerHour / 1.609);
			System.out.println(x);
			return (long) x;
			
		}
		//return (long) kilometersPerHour;
	}

	public static void printConversion(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			long milesPerHours = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h = " + milesPerHours + " mi/h");
		}
	}

}
