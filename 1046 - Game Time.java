import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int start = 0;
		int end = 0;
		int time = 0;
        
		start = scan.nextInt();
		end = scan.nextInt();
        
		if (start <= 24 && end <= 24 && start >= 0 && end >= 0) {
			if (end > start) {
				time = end - start; 
		}
			
		else if (end < start || end == start) {
              		time = (end - start) + 24;
		}
			System.out.println("O JOGO DUROU "+ time +" HORA(S)");				
       		}				

	}

}
