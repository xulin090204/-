package 作业;

import java.io.File;

public class 访问文件路径 {

	public static void main(String[] args) {
		File file = new File("test1.txt");
		String path = file.getAbsolutePath();

		System.out.println("File：" + path);
	}
}
