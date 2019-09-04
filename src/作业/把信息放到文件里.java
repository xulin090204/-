package 作业;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

	class  把信息放到文件里{
	  public static void main(String args[]){
	    try{
	      File file = new File("D:\\营口正达门业\\新建文件夹\\生年月日.txt");

	      if (checkBeforeWritefile(file)){
	        FileWriter filewriter = new FileWriter(file);

	        filewriter.write("把下面的信息写入文件“据报道，9月1日，东涌往机场方向道路被非法示威者阻塞。港铁青衣站约30名黑衣人在列车到来时，未付车资忽然冲闸，进入车厢内。暴徒还破坏车站设施，包括喷涂、打砸售票机和闸机。\r\n" +
	        		"\r\n" +
	        		"随后，香港警方通过官方脸书发布通告介绍，下午开始有暴徒开始在机场非法集结，冲击机场保安防线。港警还在通告中警告，他们正参与未经批准的集结。由于机场的法庭禁制令仍然生效，暴徒的行为有机会构成藐视法庭。”");
	       // filewriter.write("");写入你要添加的信息

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


