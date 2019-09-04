package 作业;


	import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

	class 不需要转换数据类型把信息放到文件里 {
	  public static void main(String args[]){
	    try{
	      File file = new File("D:\\营口正达门业\\新建文件夹\\生年月日.txt");

	      if (checkBeforeWritefile(file)){
	        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file,true)));

	        pw.println("今日の最高気温は");
	        pw.println(11112);
	        pw.println("度です");

	        pw.close();
	      }else{
	        System.out.println("ファイルに書き込めません");
	      }
	    }catch(IOException e){
	      System.out.println(e);
	    }
	  }

	  private static boolean checkBeforeWritefile(File file){
	    if (file.exists()){
	      if (file.isFile() && file.canWrite()){
	        return true;
	      }
	    }

	    return false;
	  }
	}


