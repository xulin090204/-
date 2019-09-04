package 作业;

import java.io.File;

public class 访问文件夹 {

	public static void main(String[] args) {
	    File cdirectory = new File("D:\\营口正达门业\\中海结算");

	    String filelist[] = cdirectory.list();
	    for (int i = 0 ; i < filelist.length ; i++){
	      System.out.println(filelist[i]);
	    }
	  }
	}


