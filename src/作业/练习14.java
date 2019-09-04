package 作业;

public class 练习14 {

	public static void main(String[] args) {
		int 完全数 = 0;

		int 因子 = 0;

		for (完全数 = 1; 完全数 <= 10000; 完全数++) {

			int 因子之和 = 0;

			for (因子 = 1; 因子 < 完全数; 因子++) {

				if (完全数 % 因子 == 0) {

					因子之和 = 因子之和 + 因子;

				}
			}
			if (完全数 == 因子之和) {

				System.out.println(因子之和);
			}

		}
	}
}
