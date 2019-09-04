package 作业;

public class 练习5 {

	public static void main(String[] args) {
		int b = 0;
		int a = 0;
		while (++a <= 200) {
			if (a % 3 == 0) {

				b = b + a;
			}
		}
		System.out.println(b);
		System.out.println(a);
	}
}