package 作业;

public class 练习18 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		for (x = 0; x <= 9; x++) {
			for (y = 0; y <= x; y++) {
				for (z = 0; z <= y; z++) {

					if ((x * 100 + y * 10 + z) + (y * 100 + z * 10 + z) == 532) {

						System.out.println(x);
						System.out.println(y);
						System.out.println(z);
					}
				}
			}
		}
	}
}