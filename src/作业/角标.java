package 作业;

public class 角标 {

	public static void main(String[] args) {
		int[] arr=new int[] {8,6,1,0,2,4,5,9};
		int[] index=new int[] {2,0,1,4,5,3,3,1,6,2,7};
		String tel ="";
		for(int i:index) {
			tel+=arr[i];
			}
		System.out.println("徐先生联系方式："+tel);
	}


	}

