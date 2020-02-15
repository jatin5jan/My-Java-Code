package preparation;

import java.util.Scanner;

public class Encryption_Decryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		String input = s.nextLine();
		String enc = encryption(input);
		System.out.println(enc);
		String dec = decryption(enc);
		System.out.println(dec);

	}

	public static String encryption(String str) {
		String enc = "";

		char ch;
		int num;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			num = ch * 2;
			enc = enc + (char) num;

		}

		return enc;
	}

	public static String decryption(String enc) {
		String dec = "";

		char ch;
		int num;

		for (int i = 0; i < enc.length(); i++) {

			ch = enc.charAt(i);

			num = ch / 2;
			dec = dec + (char) num;

		}

		return dec;
	}
}
