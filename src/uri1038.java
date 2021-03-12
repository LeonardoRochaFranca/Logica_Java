import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
//Entrada - O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
//Saída - O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
		double preco;
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
	if (cod == 1) {
		preco = 4.00*qtd;
		System.out.printf("Total: R$ %.2f%n", preco);
	}else if (cod == 2) {
		preco = 4.50*qtd;
		System.out.printf("Total: R$ %.2f%n", preco);
	}else if (cod == 3) {
		preco = 5.00*qtd;
		System.out.printf("Total: R$ %.2f%n", preco);
	}else if (cod == 4) {
		preco = 2.00*qtd;
		System.out.printf("Total: R$ %.2f%n", preco);
	}else if (cod == 5) {
		preco = 1.50*qtd;
		System.out.printf("Total: R$ %.2f%n", preco);
		}	
		
	sc.close();
	}
		
	}

