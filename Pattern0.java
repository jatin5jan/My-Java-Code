package patterns;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		while(row<=n) {
			System.out.print("*");
			System.out.println();
			row++;
		}
		
	}

}
