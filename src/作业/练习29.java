package 作业;

public class 练习29 {

	public static void main(String[] args) {

		char[] 甲队 = { 'a', 'b', 'c' }; //用char数组表示甲队的a,b,c三名队员
		char[] 乙队 = { 'x', 'y', 'z' }; //用char数组表示乙队的x,y,z三名队员

		for (char 甲队队员 : 甲队) { //从甲队数组中获得甲队队员
			for (char 乙队队员 : 乙队) { //从乙队数组中获得乙队队员
				String 组合 = 甲队队员 + "" + 乙队队员; //将字符a,b,c,x,y,z合并转成字符串
				if (组合.equals("ax") || 组合.equals("cx") || 组合.equals("cz")) { //用"equale"关键字进行比较排除，如果组合"ax"或者组合"cx"或者组合"cz”
				} else { //就退出
					System.out.println(组合); //打印剩余的组合
				}
			}
		}
	}
}