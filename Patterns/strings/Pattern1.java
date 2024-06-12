package pattern.strings;

/*
Program to print following pattern.
String s = "Hello";
output:
H
He
Hel
Hell
Hello
*/
public class Pattern1 {
	public static void main(String[] args) {
		String str = "Hello";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}
