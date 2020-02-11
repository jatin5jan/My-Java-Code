// TO Print this pattern

//5
//*****
//****
//***
//**
//*




package patterns;

import java.util.Scanner;

public class Pattern3 {

	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		int n=s.nextInt();
		
		int row=1;
		int nst=n;
		while(row<=n) {
			
//			int col=1;
//			while(col<=n-row+1) {
//				System.out.print("*");
//				col++;
//			}
			
			int cst=1;
			
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			System.out.println();
			row++;
			nst--;
		}
		
	}
}
