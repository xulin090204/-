package 作业;

public class 练习一 {

	public static void main(String[] args) {
		int[] i = {90, 12, 35, 88, 66};
		for(int a=0;a<i.length-1;a++) {
			for(int b=i.length-1;b>a;b--) {
				if(i[b]<i[b-1]) {
                int c=i[b];
                i[b]=i[b-1];
                i[b-1]=c;

				}
			}
		}
			for(int d:i) {
				System.out.println(d);
			}
	}
	}

