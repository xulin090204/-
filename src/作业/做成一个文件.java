package 作业;

import java.io.File;
import java.io.IOException;

public class 做成一个文件 {

	public static void main(String[] args) {
		File newfile = new File("D:\\营口正达门业\\新建文件夹\\性别.docx");

		try {
			if (newfile.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
			} else {
				System.out.println("ファイルの作成に失敗しました");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
