import java.util.Scanner;

public class uri1061desafio {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	int x, y, inicio, fim, horaInicio, horaFim, minInicio, minFim, segInicio, segFim, dias, horas, minutos, segundos;
		
		inicio = sc.nextInt();
		horaInicio = sc.nextInt();
		minInicio = sc.nextInt();
		segInicio = sc.nextInt();
		fim = sc.nextInt();
		horaFim = sc.nextInt();
		minFim = sc.nextInt();
		segFim = sc.nextInt();
		
		dias = inicio - fim - 1;
		
		x = horaInicio - 24;
		y = horaFim - 0;
		horas = x - y;
		
		minutos = minInicio - minFim;
		
		segundos = segInicio - segFim;
		
		System.out.println();
		
		
		sc.close();
	}

}
