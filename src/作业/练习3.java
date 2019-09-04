package 作业;

public class 练习3 {

	public static void main(String[] args) {

		int a=0;
        a=Integer.parseInt(args[0]);

	 if(a<=59) {
     System.out.println("不及格");
	}
	 if(a>=60&&a<=69){
     System.out.println("及格");
	 }
	 if(a>=70&&a<=79) {
	 System.out.println("中等");
	 }
	 if(a>=80&&a<=89) {
	System.out.println("良好");
	 }
	 if(a>=90&&a<=100) {
	System.out.println("优秀");
			 }
	 }
}
