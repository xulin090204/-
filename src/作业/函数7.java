package 作业;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 函数7 {
public static List 函数7() {

	  // 1、在List<Map>数据中，有5个人的详细个人信息（练习6）
	  HashMap<String, Object> 练习6map1 =new HashMap<String, Object>();
	  练习6map1.put("id","1");
	  练习6map1.put("name","a");
	  练习6map1.put("sex","boy");
	  练习6map1.put("birthday","19900101");
	  HashMap<String, Object> 练习6map2 =new HashMap<String, Object>();
	  练习6map2.put("id","2");
	  练习6map2.put("name","b");
	  练习6map2.put("sex","girl");
	  练习6map2.put("birthday","19910101");
	  HashMap<String, Object> 练习6map3 =new HashMap<String, Object>();
	  练习6map3.put("id","3");
	  练习6map3.put("name","c");
	  练习6map3.put("sex","boy");
	  练习6map3.put("birthday","19920101");
	  HashMap<String, Object> 练习6map4 =new HashMap<String, Object>();
	  练习6map4.put("id","4");
	  练习6map4.put("name","d");
	  练习6map4.put("sex","girl");
	  练习6map4.put("birthday","19930101");
	  HashMap<String, Object> 练习6map5 =new HashMap<String, Object>();
	  练习6map5.put("id","5");
	  练习6map5.put("name","e");
	  练习6map5.put("sex","boy");
	  练习6map5.put("birthday","19940101");
	  List<HashMap<String, Object>> li = new ArrayList<HashMap<String, Object>>();
	  li.add(练习6map1);
	  li.add(练习6map2);
	  li.add(练习6map3);
	  li.add(练习6map4);
	  li.add(练习6map5);

	  return li;

	 }

}
