package 作业;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class 三个人的信息分类放到三个文件里 {

	public static void main(String[] args) {
		File newfile1 = new File("D:\\营口正达门业\\名字.txt");

		try {
			if (newfile1.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
			} else {
				System.out.println("ファイルの作成に失敗しました");
			}
			if (checkBeforeWritefile(newfile1)) {
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newfile1, true)));

				pw.println("1," + "A桑");
				pw.println("2," + "B桑");
				pw.println("3," + "C桑");

				pw.close();
			} else {
				System.out.println("ファイルに書き込めません");
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		File newfile2 = new File("D:\\营口正达门业\\出生.txt");

		try {
			if (newfile2.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
			} else {
				System.out.println("ファイルの作成に失敗しました");
			}

			if (checkBeforeWritefile(newfile2)) {
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newfile2, true)));

				pw.println("1," + "19900101");
				pw.println("2," + "19910101");
				pw.println("3," + "19920101");

				pw.close();
			} else {
				System.out.println("ファイルに書き込めません");
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		File newfile3 = new File("D:\\营口正达门业\\性别.txt");
		try {
			if (newfile3.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
			} else {
				System.out.println("ファイルの作成に失敗しました");
			}
			if (checkBeforeWritefile(newfile3)) {
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newfile3, true)));

				pw.println("1," + "男");
				pw.println("2," + "男");
				pw.println("3," + "女");

				pw.close();
			} else {
				System.out.println("ファイルに書き込めません");
			}
		} catch (IOException e) {
			System.out.println(e);
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
