package 作业;


	import java.util.LinkedList;

	class 集合内快速删除数值 {
	  public static void main(String args[]){
	    LinkedList<String> array = new LinkedList<String>();

	    array.add("日本");
	    array.add("ブラジル");
	    array.add("イングランド");

	    for (int i = 0 ; i < array.size() ; i++){
	      String country = array.get(i);//get取得数值
	      System.out.println(country);
	    }

	    System.out.println("¥r¥n2番目の国をイタリアへ置き換えます¥r¥n");

	    array.set(1, "イタリア");//set覆盖数值

	    for (int i = 0 ; i < array.size() ; i++){
	      String country = array.get(i);
	      System.out.println(country);
	    }

	    System.out.println("¥r¥n先頭の国を削除します¥r¥n");

	    array.remove(0);//删除0位数值

	    for (int i = 0 ; i < array.size() ; i++){
	      String country = array.get(i);
	      System.out.println(country);
	    }
	  }
	}


