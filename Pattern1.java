// TO Print this pattern

//5
//*****
//*****
//*****
//*****
//*****




package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= n) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}

	}
}
