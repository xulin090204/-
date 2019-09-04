package 作业;

public class 练习6 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		for (a = 200; a <= 500; a++) {
			boolean susu = true;
			for (b = 2; b <= a - 1; b++) {
				if (a % b == 0) {
					susu = false;
				}
			}

			if (susu == true) {

				System.out.println(a);
			}
		}
	}
}