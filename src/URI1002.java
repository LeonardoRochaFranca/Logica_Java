import java.util.Locale;
import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
	
		double area, n, raio;
		raio = sc.nextDouble();
		n = 3.14159;
		area = n * (raio*raio) ;
		System.out.printf("A=%.4f%n", area);

		
		
		sc.close();
	}

}
