
// TO Print this pattern
//5
//    *
//   **
//  ***
// ****
//*****

package patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int cst, nst = 1;
		int csp, nsp = n - 1;

		while (row <= n) {

			csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			row++;
			nsp--;
			nst++;
		}

	}
}
