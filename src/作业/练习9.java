package 作业;

public class 练习9 {
	public static void main(String[] args) {
		int a = 8976556;

		for (; a != 1;) {
			if (a % 2 != 0) {
				a = a * 3 + 1;
			}

			if (a % 2 == 0) {
				a = a / 2;

			}
		}
		System.out.println(a);
	}
}
