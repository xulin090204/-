package 作业;

	import java.util.HashMap;

	class map的赋值检索删除 {
	  public static void main(String args[]){
	    HashMap<String,String> map = new HashMap<String,String>();

	    map.put("りんご", "apple");
	    map.put("ぶどう", "grapes");

	    if (map.containsKey("りんご")){  //检索指定的值
	      System.out.print("りんごを英語にすると");
	      System.out.println(map.get("りんご"));
	    }else{
	      System.out.println("指定したキーは存在しません");
	    }

	    map.remove("ぶどう");//删除指定的值

	    if (map.containsKey("ぶどう")){
	      System.out.print("ぶどう英語にすると");
	      System.out.println(map.get("ぶどう"));
	    }else{
	      System.out.println("指定したキーは存在しません");
	    }
	  }
	}


