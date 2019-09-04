package 作业;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

	class   将集合里的值转到文件里 {
	  public static void main(String args[]){
		  ArrayList<String> array = new ArrayList<String>();

		    array.add("日本");
		    array.add("ブラジル");
		    array.add("イングランド");
		    array.add("ポルトガル");
		    array.add("フランス");

		     array.get(0);
		     array.get(1);
		     array.get(2);
		     array.get(3);
		     array.get(4);

	    File newfile = new File("D:\\营口正达门业\\简历12");

		try {
			if (newfile.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
			} else {
				System.out.println("ファイルの作成に失敗しました");
			}

			if (checkBeforeWritefile(newfile)) {
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newfile, true)));

				pw.println(array.get(0));
				pw.println(array.get(1));
				pw.println(array.get(2));
				pw.println(array.get(3));
				pw.println(array.get(4));
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

