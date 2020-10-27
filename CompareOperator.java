package Compare;
import java.util.Scanner;

public class CompareOperator {

	public static void main(String[] args) {
		boolean result;
		System.out.println("enetr the first number :");
		Scanner num1 = new Scanner (System.in);
		String nu1 = num1.nextLine();
		System.out.println("enetr the second number :");
		Scanner num2 = new Scanner (System.in);
		String nu2 = num2.nextLine();
		System.out.println("enetr the third number :");
		Scanner num3 = new Scanner (System.in);
		String nu3 = num3.nextLine();
		float i = Float.parseFloat(nu1);
		float f = Float.parseFloat(nu2);
		float g = Float.parseFloat(nu3);
		result = (i > f) || (g > i);
    	// result will be true because (number1 > number2) is true
    	System.out.println(result);
    			
    	// All expression must be true from result to be true	
    	result = (i > f) && (g > i);
    	// result will be false because	(number3 > number1) is false
    	System.out.println(result);
		 
}

}
