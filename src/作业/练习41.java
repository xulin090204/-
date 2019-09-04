package 作业;

public class 练习41 {

	public static void main(String[] args) {
		for(int a=1900;a<=2000;a++) {
			if((a%4==0&&a%100!=0)||a%400==0) {

				System.out.println(a);
			}
		}
	}
}
