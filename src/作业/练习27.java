package 作业;

public class 练习27 {

	public static void main(String[] args) {
		int a = 0;
		for (a = 1;; a++) {
			if (is完全平方数(a + 100) != 0 && is完全平方数(a + 100 + 168) != 0) {
				System.out.println(a);
			}
		}
	}



	public static int is完全平方数(int i) {
		int b=0;
		for(b=1;b<i;b++) {
			if(b*b == i) {
				return b;
			}
		}
		return 0;
	}

}
