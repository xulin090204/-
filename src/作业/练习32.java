package 作业;

public class 练习32 {
                                                     //求1+2！+3！  ......+20!   的和
	public static void main(String[] args) {

		long 阶层数的和 = 0;
		for(int a=1;a<=20;a++) { // 1到20个数，循环

			int 阶层数=1;
			// 求每个数的阶层数
			for(int b=1;b <=a;b++) {
				// 1！=1
				// 2！=1*2
				// 3！=1*2*3

				阶层数 = 阶层数*b;
			}

			// 求阶层数的和
			阶层数的和 += 阶层数;
			System.out.println(阶层数的和);
		}

	}

}
