
// TO Print this pattern

//5
//*
//**
//***
//****
//*****
//
//
package patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int row = 1;

		while (row <= n) {

			int col = 1;
			while (col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println();

			row++;
		}

	}

}
