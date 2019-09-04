package 作业;

public class 练习24 {

	public static void main(String[] args) {
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 4; b++) {
				for (int c = 1; c <= 4; c++) {
					if (a != b && b != c && c != a) {
						System.out.println(a+""+b+c);//数值转字符串
					}
				}
			}
		}
	}
}
