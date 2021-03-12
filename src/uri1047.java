import java.util.Scanner;

public class uri1047 {

	public static void main(String[] args) {
// Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo. Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
// Entrada - Quatro números inteiros representando a hora de início e fim do jogo.
// SAIDA - Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)”.
	Scanner sc = new Scanner (System.in);
		int horasTotais, minutosTotais, n1, n2;
			int horaInicial = sc.nextInt();
			int minutosIniciais = sc.nextInt();
			int horaFinal = sc.nextInt();
			int minutosFinais = sc.nextInt();
	if (horaInicial == horaFinal && minutosIniciais == minutosFinais) {
		horasTotais = 24;
		minutosTotais = 0;
	}
	else if(horaInicial < horaFinal) {
		horasTotais = horaInicial - horaFinal;
	}
	else if(horaInicial > horaFinal && horaFinal == 0) {
		horasTotais = horaInicial - 24;
	}else {
		n1 = horaInicial - 24;
		horasTotais = n1 + horaFinal;
	}
		if(minutosIniciais < minutosFinais) {
			minutosTotais = minutosIniciais - minutosFinais;
		}
		else if(minutosIniciais > minutosFinais && minutosFinais == 0)	{
				minutosTotais= minutosIniciais - 60;
			
		}else {
			n2 = minutosIniciais - 60;
			minutosTotais = n2 + minutosFinais;
		}
			
			System.out.println("O JOGO DUROU " + Math.abs(horasTotais) + " HORA(S) E " + Math.abs(minutosTotais) + " MINUTO(S)");
			sc.close();
		
		
	}

}
