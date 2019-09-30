package 作业;

public class JSample6_0_1 {

	private static String 如果明天下雨我就不回国;

	public static void main(String[] args) {
		String[] arr=new String[] {如果明天下雨我就不回国};
		int[] index=new int[] {2,0,3,2,4,0,1,3,2,3,3};
		String tel ="";
		for(int i:index) {
			tel+=arr[i];
			}
		System.out.println("联系方式："+tel);
	}

}
