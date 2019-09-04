package 作业;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

	class 加快把信息放到文件里{
	  public static void main(String args[]){
	    try{
	      File file = new File("D:\\营口正达门业\\新建文件夹\\生年月日.txt");

	      if (checkBeforeWritefile(file)){
	        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

	        bw.write("喀喀喇 了咯就哦哦妈妈 ");
	        bw.newLine();
	       bw.write("欧珀围殴佛教教派我敬佩敬佩我就怕, ");
	        bw.newLine();

	        bw.close();
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


