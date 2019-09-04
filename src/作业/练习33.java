package 作业;

public class 练习33 {

	public static void main(String[] args) {

		System.out.println("5的阶层数="+取得阶层数(5));
	}

	private static long 取得阶层数(int i) {
		// 1的阶层数就是1
		if(i==1) {
			return 1;
		}

		// 5*4*3*2*1
		//   4*3*2*1
		//     3*2*1
		//       2*1
		//         1
		return i*取得阶层数(i-1);
	}

}
