import java.util.Scanner;

public class uri1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		int min, seg, hr, n;
		
	n = sc.nextInt();
	
	min = 0;
	seg = 0;
	hr = 0;
	
	min = n / 60;
	seg = n % 60;
	
	hr = min / 60;
	min = min % 60;
	
	System.out.println(hr + ":" + min + ":" + seg);
				
		sc.close();

	}

}
