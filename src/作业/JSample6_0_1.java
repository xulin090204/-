package 作业;

public class JSample6_0_1 {

	public static void main(String[] args) {
		int[] arr=new int[] {"如"，"果"，"明"，"天"，"下"，"雨"，"我"，"就"，"不"，"回"，"国"};
		int[] index=new int[] {2,0,3,2,4,0,1,3,2,3,3};
		String tel ="";
		for(int i:index) {
			tel+=arr[i];
			}
		System.out.println("联系方式："+tel);
	}

}
