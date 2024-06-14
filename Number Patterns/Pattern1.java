/*
 *Input number = 181725
 *Output
 *55555
 *22
 *7777777
 *1
 *88888888
 *1
 */
public class Pattern1 {
	public static void main(String[] args) {
		int num = 181725;
		int r = 0;

		while (num > 0) {
			r = num % 10;
			num = num / 10;

			for (int i = 1; i <= r; i++) {
				System.out.print(r);
			}
			System.out.println();
		}
	}
}
