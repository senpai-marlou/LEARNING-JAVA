import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        double salary = scan.nextDouble();
        double total;
        double add;
        
        if (salary > 0 && salary <= 400) {
            add = salary * (double)0.15;
            total = salary + add;
            System.out.println("Novo salario: " + df.format(total));
            System.out.println("Reajuste ganho: "+ df.format(add));
            System.out.println("Em percentual: 15 %");    
        }
        
        else if (salary > 400 && salary <= 800) {
            add = salary * (double)0.12;
            total = salary + add;
            System.out.println("Novo salario: " + df.format(total));
            System.out.println("Reajuste ganho: "+ df.format(add));
            System.out.println("Em percentual: 12 %");    
        }
        
        else if (salary > 800 && salary <= 1200) {
            add = salary * (double)0.10;
            total = salary + add;
            System.out.println("Novo salario: " + df.format(total));
            System.out.println("Reajuste ganho: "+ df.format(add));
            System.out.println("Em percentual: 10 %");    
        }
        
        else if (salary > 1200 && salary <= 2000) {
            add = salary * (double)0.07;
            total = salary + add;
            System.out.println("Novo salario: " + df.format(total));
            System.out.println("Reajuste ganho: "+ df.format(add));
            System.out.println("Em percentual: 7 %");    
        }
        
        else if (salary > 2000) {
            add = salary * (double)0.04;
            total = salary + add;
            System.out.println("Novo salario: " + df.format(total));
            System.out.println("Reajuste ganho: "+ df.format(add));
            System.out.println("Em percentual: 4 %");    
        }				

	}

}
