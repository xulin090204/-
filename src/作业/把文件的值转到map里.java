package 作业;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

class 把文件的值转到map里{
  public static void main(String args[]){
    try{
      File file = new File("C:\\Users\\徐林\\Desktop\\在库日期.txt");

      BufferedReader br = new BufferedReader(new FileReader(file));
   
      HashMap<String,String> map = new HashMap<String,String>();


      String str;
      while((str = br.readLine()) != null){// 循环，知道无法读取下一行为止
        System.out.println(str);
        // 问题：怎么从str中，将key和value的值，取出来。2019-9-3

        String [] 分解 = str.split(",");//

        String key =分解[0];
        String value = 分解[1];
        map.put(key, value);
      }
      br.close();
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}

