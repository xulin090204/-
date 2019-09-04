package 作业;


	import java.util.ArrayList;

	class 删除集合里的值根据角标 {
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

	    System.out.println("2番目の項目を削除します");

	    array.remove(2);        //根据角标来删除，后一位顶到所删掉的那一位

	    for (int i = 0 ; i < array.size() ; i++){
	      String country = array.get(i);
	      System.out.println(country);
	    }

	    System.out.println("「大阪」の項目を削除します");

	    array.remove(array.indexOf("大阪"));

	    for (int i = 0 ; i < array.size() ; i++){
	      String country = array.get(i);
	      System.out.println(country);
	    }

	    System.out.println("全ての項目を削除します");

	    array.clear();

	    System.out.println("現在の項目数は " + array.size() + " です");

	  }
	}


