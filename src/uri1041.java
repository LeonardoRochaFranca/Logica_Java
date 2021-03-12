import java.util.Locale;
import java.util.Scanner;

public class uri1041 {
//Entrada - A entrada contem as coordenadas de um ponto. // SAIDA - A saída deve apresentar o quadrante em que o ponto se encontra.
//Se o ponto estiver na origem, escreva a mensagem “Origem”.Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double x = sc.nextDouble();
	double y = sc.nextDouble();
	
	if (y>0.0 && x>0.0) {
		System.out.println("Q1");
	}
	else if(y>0.0 && x<0.0) {
		System.out.println("Q2");
	}
	else if(y<0.0 && x<0.0) {
		System.out.println("Q3");
	}
	else if(y<0.0 && x>0.0) {
		System.out.println("Q4");
	}
	else if(y!=0.0 && x == 0.0) {
		System.out.println("Eixo Y");
	}
	else if(x!=0.0 && y == 0.0) {
		System.out.println("Eixo X");
	}else {
		System.out.println("Origem");
	}
	sc.close();

	}

}
