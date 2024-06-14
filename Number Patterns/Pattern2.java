/*
 *Input number = 987654
 *Output
 *444
 *555
 *666
 *777
 *888
 *999
 */
public class Pattern2 {
	public static void main(String[] args) {
		int num = 987654;
		int r = 0;
		while (num > 0) {
			r = num % 10;
			num = num / 10;

			for (int i = 1; i <= 3; i++) {
				System.out.print(r);
			}
			System.out.println();
		}
	}

}
