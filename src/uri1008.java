import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario, horasTrabalhadas;
		double salarioHora, salario;
		
		numFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		salarioHora = sc.nextDouble();
		salario = (double)horasTrabalhadas*salarioHora;
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
