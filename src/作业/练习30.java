package 作业;

public class 练习30 {

	public static void main(String[] args) {
//

		int c[] = {0,1,3,6,8,6,3,1};
		for(int a=1 ;a<8;a++) {
			int 空格个数= 0;
			if(a<=4) {
				空格个数=4-a;
			}else {
				空格个数=a-4;
			}
			for(int b=1;b<=空格个数;b++) {
				System.out.print(" ");
			}
			// 1 2 3 4 5 6
			// 2 3 2 2 3 2
			for(int b=1;b<=c[a];b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
