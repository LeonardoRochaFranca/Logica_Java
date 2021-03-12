import java.util.Scanner;

public class uri1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,maiorab,maiorxc;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		maiorab = (a + b + Math.abs(a - b))/2;
		maiorxc = (maiorab + c + Math.abs(maiorab - c))/2;
		
		System.out.println(maiorxc + " eh o maior");
		
		sc.close();
	}

	
	}


