import java.util.Scanner;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		 
    		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int ab = (a + b + Math.abs(a - b))/2;
		int abc = (ab + c + Math.abs(ab - c))/2;
		
		System.out.println(abc+" eh o maior");
		
		// below is only trial for "The Greatest" // try this https://www.youtube.com/watch?v=WZTFAiTO-XE
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int s = scan.nextInt();
		
		int a1 = a;
		int a2 = b;
		int a3 = s;
		
		if (a1 > a2) {
			if (a2 > a3) {
				System.out.println(a+" eh o maior");
			}
		}
		else if (a1 < a2) {
			if (a2 > a3) {
				System.out.println(b+" eh o maior");
			}
				else if (a3 > a2) {
					if (a2 > a1 ) {
					System.out.println(s+" eh o maior");
				}
			}
		}		
		else if (a2 < a1) {
			if (a1 > a3) {
				System.out.println(b+" eh o maior");
			}
		}
		
		else if (a3 > a1) {
			if (a1 > a2) {
				System.out.println(s+" eh o maior");
			}
		}

	}

}
