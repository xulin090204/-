package 作业;

public class 练习34 {

	public static void main(String[] args) {
		int 位数=0 ;

		String b = args[0];

		char c[] = b.toCharArray();

		位数=c.length;
		System.out.println(位数);

		for (int i = c.length - 1; i >= 0; i--) {

			System.out.print(c[i]);
		}
	}
}
