package 作业;

import java.util.Arrays;

public class 练习31 {

	public static void main(String[] args) {
		 int[] 分子= {2,3};                        //设分子数组  分清期房还是现房
		 int[] 分母= {1,2};                        //设分母数组

		 for(int a=2;a<=19;a++) { 		// a只表示计数
			 int b=0;
			 int c=0;
			 b=分子[a-1]+分子[a-2];
			 c=分母[a-1]+分母[a-2];

			 //将新的分子存入数组
			 	// 将数组大小扩充
			 	分子=Arrays.copyOf(分子, 分子.length+1);
			 	分子[分子.length-1]=b;
			 	//
			 //将新的分母存入数组
			 	分母=Arrays.copyOf(分母, 分母.length+1);
			 	分母[分母.length-1]=c;
		 }

		 // 求前面所有分数的合计值
		 //int[] 分子= {2,3,5,8,13,21,,,,,,};                        //设分子数组  分清期房还是现房
		 //int[] 分母= {1,2,3,5, 8,13,,,,,,};                        //设分母数组
		 double 分数 = 0.0;
		 for(int i=0; i<分子.length; i++) {
			 //分数 += (double)分子[i]/分母[i];
			 分数 = 分数+(double)分子[i]/分母[i];
			 System.out.println(分数);
		 }



		}
	}

