package 作业;

public class 练习17 {

	public static void main(String[] args) {
		for (int a = 100; a <= 999; a++) {
			String b = a+"";
			char[] c = b.toCharArray();
			int d = 0;
			int 和每位三次密的和 = 0;

			for (d = 0; d <= c.length - 1; d++) {
				//int 每位数 =0;

				int 每位数 = Integer.parseInt(c[d] + "");//转字符串
				和每位三次密的和 = 和每位三次密的和 + 每位数 * 每位数 * 每位数;
			}

			if (和每位三次密的和 == a) {

				System.out.println(a);
			}
		}
	}
}