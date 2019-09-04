package 作业;

public class 练习16 {

	public static void main(String[] args) {
		int 桃子数 = 1;
		for (int 天数 = 10;; 天数--) {
			if (天数 == 0) {
				break;
			}

			System.out.println(桃子数);
			桃子数 = 桃子数 * 2 + 1;
		}

	}

}
