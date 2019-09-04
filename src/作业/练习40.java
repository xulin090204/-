package 作业;

public class 练习40 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		for (a = 2; a <= 100; a++) {
			boolean 素数 = true;
			for (b = 2; b < a; b++) {
				if (a % b == 0) {
					素数 = false;
					break;
				}
			}
		    if (素数 == true) {
		    	System.out.println(a);
		    }

		}
	}
}