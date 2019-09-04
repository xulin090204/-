package 作业;

import java.util.Arrays;

public class 练习35 {

	public static void main(String[] args) {
		// 思路，当前行的每个位置上的数字，要看上一行相关位置的数字

		// 关键，顺利取得任意一行每一位之的数字

		// 如何，取得取得是关键

//杨辉三角[]=
//		{
//			"1",
//			"1,1"
//			"1,2,1"
//			"1,3,3,1",
//			"1,4,6,4,1",
//			"1,5,10,10,5,1"
//		}
		String 杨辉三角[]= {};

		// 取得杨辉三角
		for(int i行数=0 ;i行数<=9; i行数++){ 			// 每一行
			String s杨辉三角的一行 = "";
			for(int i列数=0 ;i列数<=i行数; i列数++) {	// 每一列

				String s该位置上的值 = 取得某位置的值byX_Y(i行数,i列数,杨辉三角);

				// 把取到的值加到该行的杨辉三角中的行中
				if(s杨辉三角的一行.equals("")) {
					s杨辉三角的一行 = s该位置上的值;
				}else {
					s杨辉三角的一行 = s杨辉三角的一行 + ","+s该位置上的值;
				}

			}

			// 把每一行加到杨辉三角中去
			杨辉三角 = Arrays.copyOf(杨辉三角, 杨辉三角.length+1);
			杨辉三角[杨辉三角.length-1]=s杨辉三角的一行;
		}

		// 打印杨辉三角
		int 空格个数 = 9;
		for(String s : 杨辉三角) {

			for(int b=空格个数;b>=1;b--) {
				System.out.print(" ");
			}
			System.out.println(s);
			空格个数--;
		}
	}


	private static String 取得某位置的值byX_Y(int i行数, int i列数, String[] 杨辉三角) {
		if(i行数 == 0 && i列数 == 0) {
			return "1";
		}

		String 上排对应位置 = 取得某位置的值byX_Y2(i行数-1, i列数, 杨辉三角);
		String 上排对应前一位置 = 取得某位置的值byX_Y2(i行数-1, i列数-1, 杨辉三角);
		return Integer.parseInt(上排对应位置)+Integer.parseInt(上排对应前一位置)+"";
	}


	private static String 取得某位置的值byX_Y2(int 行号, int 列号, String[] 杨辉三角) {
		if(行号<0) {
			return "0";
		}
		if(列号>行号) {
			return "0";
		}
		if(行号==0) {
			if(列号==0) {
				return "1";
			}
			return "0";
		}
		if(列号<0) {
			return "0";
		}


		String s行 = 杨辉三角[行号];
		// 通过String的split方法，将s分解
		// 例子、s="1,1";
		//       分解 = s.split(",")
		//       分解 = {"1","1"};
		String[] s行数组 = s行.split(",");

		return s行数组[列号];

	}

}
