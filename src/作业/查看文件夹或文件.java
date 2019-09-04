package 作业;

import java.io.File;

public class 查看文件夹或文件 {

	public static void main(String[] args) {
		File cdirectory = new File("D:\\营口正达门业");

		File filelist[] = cdirectory.listFiles();
		for (int i = 0; i < filelist.length; i++) {
			if (filelist[i].isFile()) {
				System.out.println("[F]" + filelist[i].getName());
			} else if (filelist[i].isDirectory()) {
				System.out.println("[D]" + filelist[i].getName());
			} else {
				System.out.println("[?]" + filelist[i].getName());
			}
		}
	}
}
