package 作业;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class 数据写入文本数据库 {

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
		 * a（list）
		 * |
		 * |-----c(map)
		 * 		  |    (key)
		 * 		  |----id		===练习7
		 * 		  |----name		===练习7
		 * 		  |----sex		===练习7
		 * 		  |----birthday	===练习7
		 * 		  |----技术    	===练习9
		 *				|b=(value)
		 *				|----（List）
		 *						|----java
		 *						|----windows
		 *
		 */
		// UI:

		// ========方案1 SS ========
		// 1 设置一个变量【当前技术id】（保存最后一个读取的技术的id，初始值是0，每读取一个技术时，它的id=当前技术id+1）
		// 2 遍历a中的每个人
		//     2.1 取得这个人的id
		//	   2.2 取得这个人的技术list--b（b代表这个人所有技术的list）
		//     2.3 设置一个变量 d;
		//     2.4 遍历b的每一个值=>c(c表示这个人的当前技术 例："java")
		//         2.4.1 写入文件【项目.txt】
		//			   写入的内容= ++当前技术id +"," + c // 例："1,java"
		//	       2.4.2编辑d，用于写入【技术者.txt】(d = d + " " +当前技术id) // d="1" d="1 2" d="1 2 3"
		//     遍历b结束--2.4结束
		//     2.5 写入【技术者.txt】
		//			写入的内容= 这个人的id + ","+d // d 代表这个人的所有技术id的字符串，且两边要去空格
		// 遍历a结束--2结束

		// 1 设置一个变量【当前技术id】
		int 当前技术id = 0;

		// 2 遍历a中的每个人
		for(int i=0;i<a.size();i++ ) {
			// 2.1 取得这个人的id
			Map c=a.get(i);
			String 这个人的id = (String) c.get("id");

			// 2.2 取得这个人的技术list--b（b代表这个人所有技术的list）
			List b = (List) c.get("技术");

			// 2.3 设置一个变量 d;
			String d = "";
			利用函数建无数文件写入值 e = new 利用函数建无数文件写入值();

			// 2.4 遍历b的每一个值=>c(c表示这个人的当前技术 例："java")
			for(int j=0;j<b.size();j++) {
				// 2.4.1 写入文件【项目.txt】
				//       写入的内容= ++当前技术id +"," + s // 例："1,java"
				String s技术项目 =  (String) b.get(j);
				e.文件書込("D:\\营口正达门业\\文本数据\\项目.txt", ++当前技术id +"," + s技术项目);

				// 2.4.2 编辑d，用于写入【技术者.txt】(d = d + " " +当前技术id) // d="1" d="1 2" d="1 2 3"
				d = d + " " + 当前技术id;
			} //遍历b结束--2.4结束

			// 2.5 写入【技术者.txt】
			//     写入的内容= 这个人的id + ","+d // d 代表这个人的所有技术id的字符串，且两边要去空格
			e.文件書込("D:\\营口正达门业\\文本数据\\技术者.txt", 这个人的id +"," + d);


		}//遍历a结束--2结束
	}

	private static boolean checkBeforeWritefile(File f) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}



}