package 作业;

public class 练习15 {

	public static void main(String[] args) {
		int a = 0;
		for (a = 1; a <= 10000; a++) {
			String b = "" + a;
			char[] c = b.toCharArray();
			int d = 0;
			int e = 0;
			for (d = 0; d <= c.length - 1; d++) {

				e = e + (int) c[d];

				if (a % 9 == 0 && e % 9 == 0) {

					System.out.println(a);
				}
			}
		}
	}
}