import java.util.Scanner;

public class uri1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distancia, tempo;
		
		distancia = sc.nextInt();
		
		tempo = distancia * 2;
		
		System.out.println(tempo + " minutos");		
		
		sc.close();
	}

}
