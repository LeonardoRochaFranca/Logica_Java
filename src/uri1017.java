import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in); 
		
		int tempo, velocidadeMedia;
		double distancia, consumo;
		
		velocidadeMedia = sc.nextInt();
		tempo = sc.nextInt();
		
		distancia = velocidadeMedia*tempo;
		consumo = distancia/12;
		
		System.out.printf("%.3f%n", consumo);
				
	sc.close();

	}

}
