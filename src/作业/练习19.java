package 作业;

import java.util.regex.Pattern;

public class 练习19 {

	public static void main(String[] args) {
		String a = "我国人工智能发展已经为经济提速换挡提供了重要的动力。据初步统计，2018年与人工智能相关的产业规模已经超过5000亿元人民币。我们要深入把握新一代人工智能发展的特点，加强人工智能和产业发展融合，以人工智能带动传统产业革故鼎新，不断优化制度环境、破解人才瓶颈、挖掘市场潜力，夯基垒台、久久为功，为推动经济高质量发展添薪续力。";
		int 数值数 = 0;
		int 空格数 = 0;
		int 英文数 = 0;
		int 其它数 = 0;

		char[] c = a.toCharArray();                    //把字符串a转成字符数组c
		for (int b = 0; b <= c.length - 1; b++) {      //设数值变量b，b是字符数组c的任意数
			String d = c[b] + "";                     //把字符数组c的b转成字符串d
			if (isInteger(d)) {                      //如果字符串d里有数值数
				数值数++;                               //数值数相加
			} else                                     //不是退出
				//if (Character.isSpace(c[b])) {         //如果字符串d里有空格
				if(d.equals(" ")) {
				空格数++;                               //空格数相加
			} else                                     //不是退出
				if (d.matches("[a-zA-Z]+")) {          //如果字符串d里有英文
				英文数++;                                //英文数相加
			} else                                      //不是退出
				其它数++;                                //剩余的字符数相加
		}
		System.out.println("数值数" + 数值数);               //打印数值数
		System.out.println("空格数" + 空格数);            //打印空格数
		System.out.println("英文数" + 英文数);           //打印英文数
		System.out.println("其它数" + 其它数);           //打印其它数
	}

	public static boolean isInteger(String str) {         //判断字符串d里是否有数值的函数
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(str).matches();
	}
}
