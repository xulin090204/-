package 作业;

	import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

	class 追加信息放到文件里{
	  public static void main(String args[]){
	    try{
	      File file = new File("D:\\营口正达门业\\新建文件夹\\生年月日.txt");

	      if (checkBeforeWritefile(file)){
	        FileWriter filewriter = new FileWriter(file, true);

	        filewriter.write("普拉多");
	        //filewriter.write("ではまた¥r¥n");

	        filewriter.close();
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


