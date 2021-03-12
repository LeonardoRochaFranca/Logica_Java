import java.util.Locale;
import java.util.Scanner;

public class uri1014 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia;
		double gastoCombustivel, consumoMedio;
		
		
		distancia = sc.nextInt();
		gastoCombustivel = sc.nextDouble();
		
		consumoMedio = distancia / gastoCombustivel;
		
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		
		sc.close();

	}

}
