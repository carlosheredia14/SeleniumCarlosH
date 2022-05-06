package Ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {


		
		int number =12;
		printNumberInWord(number);

	}
	public static void printNumberInWord(int number){
		
		String numberStr = "";
		switch (number) {
        case 0:  numberStr = "ZERO";  break;
        case 1:  numberStr = "ONE";   break;
        case 2:  numberStr = "TWO";   break;
        case 3:  numberStr = "THREE"; break;
        case 4:  numberStr = "FOUR";  break;
        case 5:  numberStr = "FIVE";  break;
        case 6:  numberStr = "SEX";   break;
        case 7:  numberStr = "SEVEN"; break;
        case 8:  numberStr = "EIGHT"; break;
        case 9:  numberStr = "NINE";  break;
        default: numberStr = "OTHER"; break;
		
	}
		
		System.out.println(numberStr);

}
}
