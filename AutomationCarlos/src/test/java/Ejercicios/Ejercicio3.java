package Ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shouldWakeUp(true, 1);
		
	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		
			if ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay < 24)) {

				return true;
			} else {
				return false;
			}
		
	}

}
