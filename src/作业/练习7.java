package 作业;

public class 练习7 {
	public static void main(String[] args) {
	for(int a=0;a<=100/5;a++) {
    for(int b=0;b<=100/3;b++) {
	for(int c=0;c<=100*3;c++) {
		int 百只=a+b+c*3;
		int 百元=a*5+b*3+c;
		if((百元==100)&&(百只==100)) {
			System.out.println("公鸡="+a +"母鸡="+b +"小鸡="+c);
		}
	}
    }
	}
	}

}
