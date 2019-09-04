package 作业;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class 利用函数建无数文件写入值 {
	public static void main(String args[]){

		//new 练习100().文件書込("", "");

		利用函数建无数文件写入值 a = new 利用函数建无数文件写入值(); // a 实例
		a.文件書込("D:\\营口正达门业\\名字9", "1，A桑");// 用实例a，来帮你完成对非static函数的调用。
		a.文件書込("D:\\营口正达门业\\名字9", "2，B桑");
		a.文件書込("D:\\营口正达门业\\名字9", "3，C桑");
		a.文件書込("D:\\营口正达门业\\名字10", "3，C桑");
		//文件書込("", "");
	}

		public void 文件書込(String path,String 書込内容 ){
			PrintWriter pw;

			try {
				// 如果文件和文件夹都不存在就帮忙新建一个
				File f = new File(path);// f是指向文件的实例。f就是总统特使。
				if(!checkBeforeWritefile(f)) {
					// 如果对象文件不存在，就尝试新建一个。
					new File(path).createNewFile();
				}

				//pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)));
				System.out.println(path);
				pw = new PrintWriter(
						new BufferedWriter(
								new FileWriter(
										path, true)));
				pw.println(書込内容);
				pw.close();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

		}

		  private static boolean checkBeforeWritefile(File file) {
				if (file.exists()) {
					if (file.isFile() && file.canWrite()) {
						return true;
					}
				}

				return false;
			}


	}


