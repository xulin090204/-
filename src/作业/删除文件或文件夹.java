package 作业;

import java.io.File;

public class 删除文件或文件夹 {

	public static void main(String[] args) {
		File file = new File("D:\\营口正达门业\\简历.txt");

		if (file.exists()) {
			if (file.delete()) {
				System.out.println("ファイルを削除しました");
			} else {
				System.out.println("ファイルの削除に失敗しました");
			}
		} else {
			System.out.println("ファイルが見つかりません");
		}
	}
}
