package 作业;

import java.util.Arrays;

public class 练习2501 {
	public static void main(String[] args) {
		double 走过的长度[] = {};
		double 高度 = 100.0;
		for (int 次数 = 1;; 次数++) {
			if (次数 == 1) {
				走过的长度 = Arrays.copyOf(走过的长度, 走过的长度.length + 1);
				走过的长度[0] = 高度;
			} else {
				走过的长度 = Arrays.copyOf(走过的长度, 走过的长度.length + 2);
				走过的长度[走过的长度.length - 2] = 高度;//倒数第二个数
				走过的长度[走过的长度.length - 1] = 高度;//数组的倒数第一个数
			}
			System.out.print("第" + 次数 + "次" + "弹跳的高度=" + 高度 / 2);
			System.out.println("走过的长度=" + 数组各个数的合计(走过的长度));
			高度 = 高度 / 2; //高度等于高度除以2
			if (高度 <= 0.1) { //如果高度小于等于0.1，就退出
				break;
			}
		}
	}
	/**
	 * @param 走过的长度
	 * @return
	 */
	private static double 数组各个数的合计(double[] 走过的长度) {
		// {100}									100
		// {100 + 50 + 50}							200
		// {100 + 50 + 50 + 25 + 25}				250
		// {100 + 50 + 50 + 25 + 25 +12.5 +12.5}	275
		double 总长度 = 0.0;
		for (double 长度 : 走过的长度) {
			总长度 += 长度;
		}
		return 总长度;
	}
}
