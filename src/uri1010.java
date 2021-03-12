import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, numPecas1, codPeca2, numPecas2;
		double valorUnit1, valorUnit2, valorPecas1, valorPecas2, valorTotal;
		
		codPeca1 = sc.nextInt();
		numPecas1 = sc.nextInt();
		valorUnit1 = sc.nextDouble();
		codPeca2 = sc.nextInt();
		numPecas2 = sc.nextInt();
		valorUnit2 = sc.nextDouble();
		
		valorPecas1 = numPecas1*valorUnit1;
		valorPecas2 = numPecas2*valorUnit2;
		
		valorTotal = valorPecas1+valorPecas2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		
		sc.close();
	}
}
