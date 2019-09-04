package 作业;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class 把字符串的值转到文件里 {

	public static void main(String[] args) {
		File newfile = new File("D:\\营口正达门业\\简历.txt");
		try {
			if (newfile.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
				if (checkBeforeWritefile(newfile)) {
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newfile, true)));

					pw.println("今日の最高気温は");
					pw.println(12222);
					pw.println("isaojodajohod");

					pw.close();
				} else {
					System.out.println("ファイルに書き込めません");
				}

			} else {
				System.out.println("ファイルの作成に失敗しました");

				if (checkBeforeWritefile(newfile)) {
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newfile, true)));

					pw.println("今日の最高気温は");
					pw.println(12222);
					pw.println("isaojodajohod");

					pw.close();
				} else {
					System.out.println("ファイルに書き込めません");
				}

			}

			// throw new IOException();

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
