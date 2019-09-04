package 作业;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class 读取文件{
  public static void main(String args[]){
    try{
      File file = new File("D:\\营口正达门业\\中海和平一期延保.docx");
      FileReader filereader = new FileReader(file);

      int ch;
      while((ch = filereader.read()) != -1){
        System.out.print((char)ch);
      }

      filereader.close();
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}


