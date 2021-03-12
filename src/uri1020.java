import java.util.Scanner;

public class uri1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int diasNasc, ano, mes , dias , x;
		
		diasNasc = sc.nextInt();
		
		ano = 0;
		mes = 0;
		dias = 0;
		x = 0;
		
		ano = diasNasc / 365;
		x = diasNasc % 365;
			System.out.println(ano + " ano(s)");
		mes = x / 30;
		dias = x % 30;
			System.out.println(mes + " mes(es)");	
			System.out.println(dias + " dia(s)");
		sc.close();

	}

}
