package 作业;


	import java.util.ArrayList;

	class 改变集合上某一位上的值 {
	  public static void main(String args[]){
	    ArrayList<String> array = new ArrayList<String>();

	    array.add("日本");
	    array.add("ブラジル");
	    array.add("イングランド");
	    array.add("ポルトガル");
	    array.add("フランス");

	    for (int i = 0 ; i < array.size() ; i++){
	      String country = array.get(i);
	      System.out.println(country);
	    }

	    System.out.println("¥r¥n3番目の国をイタリアへ置き換えます¥r¥n");

	    array.set(2, "CHINA");      //set表示输入值

	    for (int i = 0 ; i < array.size() ; i++){
	      String country = array.get(i);
	      System.out.println(country);
	    }
	  }
	}

