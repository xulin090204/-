package 作业;

public class 练习26 {

	public static void main(String[] args) {
		String a = args[0];
		double i利润 = Double.valueOf(a);
		if (i利润 <= 10) {
			System.out.println(i利润 * 0.1);
		}
		if (i利润 > 10 && i利润 < 20) {
			System.out.println(i利润 * 0.075);
		}
		if (i利润 > 20 && i利润 < 40) {
			System.out.println(i利润 * 0.05);
		}
		if (i利润 > 40 && i利润 < 60) {
			System.out.println(i利润 * 0.03);
		}
		if (i利润 > 60 && i利润 < 100) {
			System.out.println(i利润 * 0.015);
		}
		if (i利润 > 100) {
			System.out.println(i利润 * 0.01);
		}

	}
}
