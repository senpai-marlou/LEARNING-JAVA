import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		double a, b, c, R1, R2;
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		if (a != 0 && b != 0 && c != 0 && (((b * b) -(4.00 * a * c)) > 0)) {
			R1 =(float) ((-b + Math.sqrt(((b * b) -(4.00 * a * c)))) / (2 * a));
			R2 =(float) ((-b - Math.sqrt(((b * b) -(4.00 * a * c)))) / (2 * a));
			
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}
		else {
			System.out.print("Impossivel calcular\n");
		}
    
	}

}
		
  	===== Unsolved, Correct Code above =====
		
		float A = scan.nextFloat();
		float B = scan.nextFloat();
		float C = scan.nextFloat();
		
		double sqrt = (B*B) - (4*(A)*(C));
		
		if(sqrt > 0 && A != 0) {
			double R1 = 0;
			double R2 = 0;
			sqrt = Math.sqrt(sqrt);
			
			R1 = (-B + sqrt) / (2*A);
			R2 = (-B - sqrt) / (2*A);
			
			System.out.println("R1 = "+df.format(R1));
			System.out.println("R2 = "+df.format(R2));
		}
		else {
			System.out.println("Impossivel calcular");
		}

	}

}
