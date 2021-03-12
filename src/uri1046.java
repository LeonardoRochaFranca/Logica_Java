import java.util.Scanner;
//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
//ENTRADA - A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
// SAIDA - Apresente a duração do jogo conforme exemplo abaixo.
public class uri1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int horaIni, horaFim, tempoIni, tempoFim, tempoTotal;
		
		horaIni = sc.nextInt();
		horaFim = sc.nextInt();
		
		tempoIni = horaIni - 24;
		tempoFim = 0 - horaFim;
		tempoTotal = tempoIni + tempoFim;
		
		System.out.println("O JOGO DUROU "+ Math.abs(tempoTotal) + " HORA(S)");
		
		sc.close();

	}

}
