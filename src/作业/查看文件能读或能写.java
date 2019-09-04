package 作业;

import java.io.File;

public class 查看文件能读或能写 {

	public static void main(String[] args) {
		File file = new File("D:\\\\pleiades\\\\workspace\\\\作业\\\\newfile.txt");

		checkPermission(file);

		if (file.setReadOnly()) {
			System.out.println("ファイルを読み取り専用にしました");
		} else {
			System.out.println("読み取り専用に変更が失敗しました");
		}

		checkPermission(file);
	}

	private static void checkPermission(File file) {
		if (file.canRead()) {
			System.out.println("ファイルは読み込み可能です");
		}

		if (file.canWrite()) {
			System.out.println("ファイルは書き込み可能です");
		}
	}
}
