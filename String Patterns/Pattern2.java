/*
 * Program to print following pattern
 * MADAM
 * MADA
 * MAD
 * MA
 * A
 */

public class Pattern2 {
	public static void main(String[] args) {
		String str = "MADAM";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length() - i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}
