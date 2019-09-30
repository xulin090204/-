package 作业;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class 数据写入文本数据库2 {

	public static void main(String[] args) {
		File newfile = new File("D:\\营口正达门业\\文本数据");
		if (newfile.mkdir()) {
			System.out.println("ディレクトリの作成に成功しました");
		} else {
			System.out.println("ディレクトリの作成に失敗しました");
		}
		File newfile1 = new File("D:\\营口正达门业\\文本数据\\技术者.txt");

		try {
			if (newfile1.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
			} else {
				System.out.println("ファイルの作成に失敗しました");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		File newfile2 = new File("D:\\营口正达门业\\文本数据\\项目.txt");
		try {
			if (newfile2.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
			} else {
				System.out.println("ファイルの作成に失敗しました");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		List<Map> a = 练习9.练习9();
		/*
		 * a（list）(所有人的所有信息)
		 * |
		 * |-----c(map)（一个人的所有信息）
		 * 		  |    (key)      (value)
		 * 		  |----id	     （String）        ===练习7
		 * 		  |----name	     （String）        ===练习7
		 * 		  |----sex	     （String）        ===练习7
		 * 		  |----birthday	 （String）        ===练习7
		 * 		  |----技术     b（List）	       ===练习9
		 *						|----java
		 *						|----windows
		 *
		 */
		// UI:写入项目文件
		/**
		 * 	1,java
			2,posgres
			3,spring
			4,windows
			5,java
			6,linux
			7,windows
			8,C#
		 */
		// 写入技术者文件
		/**
			1, 1 2
			2, 3 4
			3, 5
			4, 6 7
			5, 8
		 */

		// ========方案2 SS ========
		// 1 取得写入项目文件的内容
		// 2 取得写入技术者文件的内容
		// 3 将1的内容写入项目文件
		// 4 将2的内容写入技术者文件

		// 1 取得写入项目文件的内容
		List 写入项目文件的内容 = 取得写入项目文件的内容(a);

		// 2 取得写入技术者文件的内容
		List 写入技术者文件的内容 = 取得写入技术者文件的内容(a);

		// 3 将1的内容写入项目文件
		写入文件("D:\\营口正达门业\\文本数据\\项目.txt", 写入项目文件的内容);

		// 4 将2的内容写入技术者文件
		写入文件("D:\\营口正达门业\\文本数据\\技术者.txt", 写入技术者文件的内容);
	}

	/**
	 *
	 * @param 所有人所有信息
	 * @return
	 */
	private static List 取得写入技术者文件的内容(List<Map> 所有人所有信息) {

		List 写入技术者文件的内容 = new ArrayList();                 //新建list 写入技术者文件的内容
		int 当前技术id = 1; // 必须放外面，因为换一个人不是从1重新计数的   设变量int 当前技术id

		for (int b = 0; b < 所有人所有信息.size(); b++) {              //设变量int b,循环map 所有人所有信息里的角标
			Map 这个人的信息c = 所有人所有信息.get(b);                   //把map 所有人所有信息里的角标给map 这个人的信息c
			String 技术者id = (String) 这个人的信息c.get("id");            //取map 这个人的信息c的id给String 技术者id
			String 当前技术者的技术id = "";                            //设String 当前技术者的技术id为 " "(空格)

			List<String> 这个人的所有技术项 = (List<String>) 这个人的信息c.get("技术"); //取map 这个人的信息c的技术给List<String> 这个人的所有技术项

			// 做成 当前技术者的技术id
			for(String s : 这个人的所有技术项) {                                //打印  List<String> 这个人的所有技术项 （String s）
				当前技术者的技术id = 当前技术者的技术id + " " + 当前技术id; //1，1 2
				当前技术id = 当前技术id + 1;                                // 为下一个项目准备
			}

			写入技术者文件的内容.add(技术者id + "," + 当前技术者的技术id);   //根据角标给list 写入技术者文件的内容赋值
		}
		return 写入技术者文件的内容;//
	}

	/**
	 *
	 * @param a
	 * @return
	 */
	private static List 取得写入项目文件的内容(List<Map> a) {
    /* "1,java"
		2,posgres"
		3,spring
		4,windows
		5,java
		6,linux
		7,windows
		8,C#
		*/
		List 写入项目文件的内容 = new ArrayList();
		int 当前技术id = 1;

		for (int b = 0; b < a.size(); b++) {
			Map c = a.get(b);
			//c.get("技术");
			List<String> 这个人的所有技术项 = (List<String>) c.get("技术");
			// {Java，windows}
			//写入项目文件的内容 = 取得写入项目文件的内容;
			for (String s : 这个人的所有技术项) {
				// s=java
				// s=posgres
				写入项目文件的内容.add(当前技术id + "," + s);
				当前技术id = 当前技术id + 1;// 为下一个项目准备
			}
		}
		return 写入项目文件的内容;
	}

	/**
	 *
	 * @param path
	 * @param 写入项目文件的内容
	 */
	private static void 写入文件(String path, List 写入项目文件的内容) {
		利用函数建无数文件写入值 e = new 利用函数建无数文件写入值();
		for (String s : (List<String>) 写入项目文件的内容) {
			e.文件書込(path, s);
		}
	}
}
