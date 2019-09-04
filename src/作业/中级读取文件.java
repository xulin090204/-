package 作业;
	import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	class 中级读取文件{
	  public static void main(String args[]){
	    try{
	      File file = new File("D:\\营口正达门业\\新建文件夹\\入社年月日.txt");

	      if (checkBeforeReadfile(file)){
	        FileReader filereader = new FileReader(file);

	        int ch;
	        while((ch = filereader.read()) != -1){
	          System.out.print((char)ch);
	        }

	        filereader.close();
	      }else{
	        System.out.println("ファイルが見つからないか開けません");
	      }
	    }catch(FileNotFoundException e){
	      System.out.println(e);
	    }catch(IOException e){
	      System.out.println(e);
	    }
	  }

	  private static boolean checkBeforeReadfile(File file){
	    if (file.exists()){
	      if (file.isFile() && file.canRead()){
	        return true;
	      }
	    }

	    return false;
	  }
	}


