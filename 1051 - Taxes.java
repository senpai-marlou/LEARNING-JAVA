import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		float salary = scan.nextFloat();
		float num1 = 0;
		float num2 = 0;
		float num3 = 0;
 		float total = 0;
		
		if (salary >= 0 && salary <= 2000) {
            	System.out.println("Isento");
        	}
		if (salary > 2000 && salary <= 3000) {
			num1 = salary - 2000;
			num2 = (float) (num1 * 0.08);
			System.out.println("R$ "+df.format(num2));
		}
		if (salary > 3000 && salary <= 4500) {
			num1 = (float) (1000 * 0.08);
			num2 = salary - 3000;
			total = (float) (num1+(num2 * 0.18));
			System.out.println("R$ "+df.format(total));
		}
		if (salary > 4500) {
			num1 = (float) (1000 * 0.08);
			num2 = (float) (1500 * 0.18);
			num3 = salary - 4500;
			total = (float) (num1 + num2 + (num3 * 0.28));
			System.out.println("R$ "+df.format(total));
		}				

	}

}
