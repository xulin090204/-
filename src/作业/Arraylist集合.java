package 作业;


	import java.util.ArrayList;

	class Arraylist集合{
	  public static void main(String args[]){
	    ArrayList<String> array = new ArrayList<String>();

	    array.add("日本");
	    array.add("ブラジル");
	    array.add("イングランド");
	    array.add("ポルトガル");
	    array.add("フランス");

	    String country = array.get(0);
	    System.out.println(country);
	  }
	}


