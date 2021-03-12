import java.util.Scanner;
//2) Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
//- todos os números pares
//- a quantidade de números pares
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vet = new int[n];
		
		for(int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}
		int qtd = 0;
		for(int i = 0; i < n; i++ ) {
			if (vet[i] % 2 == 0) {
				System.out.println(vet[i]);
				qtd++;
			}
		}
		System.out.println(qtd);
		sc.close();
	}

}
