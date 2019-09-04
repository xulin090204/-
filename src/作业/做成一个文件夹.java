package 作业;

import java.io.File;

public class 做成一个文件夹 {

	public static void main(String[] args) {
		File newfile = new File("D:\\pleiades\\workspace\\作业\\src\\作业\\sub\\tmp");

		if (newfile.mkdir()) {
			System.out.println("ディレクトリの作成に成功しました");
		} else {
			System.out.println("ディレクトリの作成に失敗しました");
		}
	}
}
