package 作业;


	import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

	class   将map里的值转到文件里 {
	  public static void main(String args[]){
	    HashMap<String,String> map = new HashMap<String,String>();

	    map.put("姓名", "A桑");
	    map.put("姓别", "男");
		map.put( "生年月日", "19900101");

		map.get("姓名");
		map.get("姓别");
		map.get("生年月日");





	    File newfile = new File("D:\\营口正达门业\\简历11");

		try {
			if (newfile.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
			} else {
				System.out.println("ファイルの作成に失敗しました");
			}


			if (checkBeforeWritefile(newfile)) {
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newfile, true)));

				pw.println("姓名"+map.get("姓名"));
				pw.println("姓别"+map.get("姓别"));
				pw.println("生年月日"+map.get("生年月日"));

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

