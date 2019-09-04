package 作业;


	import java.util.ArrayList;

	class  集合的输入值找角标 {
	  public static void main(String args[]){
	    ArrayList<String> array = new ArrayList<String>();

	    array.add("東京");
	    array.add("大阪");
	    array.add("東京");
	    array.add("千葉");

	    for (int i = 0 ; i < array.size() ; i++){
	      String country = array.get(i);
	      System.out.println(country);
	    }

	    String word = "東京";
	    int first = array.indexOf(word);					    int first1 = array.indexOf("大阪");

	    System.out.println(word + "について検索します");

	    if (first != -1){
	      System.out.println("最初のインデックス番号は " + first);//first表示角标第一位东京
	    }

	    int last = array.lastIndexOf("東京");
	    if (last != -1){
	      System.out.println("最後のインデックス番号は " + last);//last表示角标最后一位东京
	    }
	  }
	}


