package 作业;

public class 练习28 {

	public static void main(String[] args) {
		// args={"200","300","100"}
		// 目的：排序输出
		// 把字符串数组转成数值int数组
		// 循环3次（冒泡算法）
		// 		把前一位置的数 与 后一位置的数 进行比较
		//			--把前数和后数转成数值型
		//			--再进行比较
		//      如果前大于后
		//			调换位置
		// 循环结束
		// 打印数组
		// 把字符数组转成数值int数组
		//char[] b=a.toCharArray();
		//int[] c=new int[b.length];

		// 将字符转成int（ascii码的值）
		//c[d] = (int)b[d]; //将49转了
		// 将字符转成int（ascii码的图）
		//c[d] = Integer.parseInt(b[d]+"");// '1'转了

		int[] c = new int[args.length];

		// 把字符串数组转成数值int数组
		for (int d = 0; d < args.length; d++) {
			// 将字符串转成int
			c[d] = Integer.parseInt(args[d]);
		}
		for (int a = 0; a < c.length; a++) {
			for (int b = c.length - 1; b > a; b--) {
				if (c[b] < c[b - 1]) {
					int z = c[b];
					c[b] = c[b - 1];
					c[b - 1] = z;
				}
			}
		}
		for (int x : c) {

			System.out.println(x);
		}
	}
}
