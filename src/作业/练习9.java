package 作业;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 练习9 {

	public static List 练习9() {
	/*
		练习9：

		给练习7的数据中的每个学员追加技术信息

		ID：1
		技术1：java
		技术2：posgres


		ID：2
		技术1：spring
		技术2：windows

		ID：3
		技术1：java


		ID：4
		技术1：linux
		技术2：windows

		ID：5
		技术1：C#

		注，技术信息也应该是
		List<Map>的形式
		List中的每一项是技术1、2、3
		      Map中的每一项是该技术的具体信息。

	 */

	/**
	 * li
	 *  【------map<String, String>
	 *          【------姓名
	 *          【------生年月日
	 *          【------技术
	 *         			 【------技术1
	 *          		 【------技术2
	 *
	 */
		// 新建练习7的技术者信息List
		List<Map> li = 练习7();

		// ID1的技术者追加技术信息:技术1：java,技术2：posgres
		List 技术list1 = new ArrayList();
		技术list1.add("java");
		技术list1.add("posgres");
		li.get(0).put("技术", 技术list1);


		// ID2的技术者追加技术信息:技术1：spring,技术2：windows
		List 技术list2 = new ArrayList();
		技术list2.add("spring");
		技术list2.add("windows");
		li.get(1).put("技术", 技术list2);


		// ID3的技术者追加技术信息:技术1：java
		List 技术list3 = new ArrayList();
		技术list3.add("java");
		li.get(2).put("技术", 技术list3);


		// ID4的技术者追加技术信息:技术1：linux,技术2：windows
		List 技术list4 = new ArrayList();
		技术list4.add("linux");
		技术list4.add("windows");
		li.get(3).put("技术", 技术list4);


		// ID5的技术者追加技术信息:技术1：C#
		List 技术list5 = new ArrayList();
		技术list5.add("C#");
		li.get(4).put("技术", 技术list5);

		return li;
	}
	public static List 练习7() {
		/**
		1、在List<Map>数据中，有5个人的详细个人信息（练习6）
		   //  name , birthday , sex 三个文件里
		   //
		   // 例、name.txt
		   // 1，A桑
		   // 2，B桑
		   // 3，C桑
		   // 4, D桑
		   // 5, E桑

		   // 例、birthday.txt
		   // 1，19900101
		   // 2，19910101
		   // 3，19920101
		   // 4，19930101
		   // 5，19940101

		   // 例、sex.txt
		   // 1，男
		   // 2，男
		   // 3，女
		   // 4, 女
		   // 5，男

		2、遍历List中的每个值

		  2.1 取出当前Map
		      2.1.1 遍历Map中的每个值
	             (1) 取出当前Map中的Entry
	                 a. 文件全路径 = "C:\\temp\\"
	                 b. 文件全路径 += Entry.key
	                 c. 写入文件的内容 = Map.get("id") + Entry.Vaule;

	             (2) 调用函数写入文件
		      		函数名：文件書込
		      		参数  ：String 文件全路径
		          		 ：String 写入文件的内容
		      		返回值：void
			  遍历结束2.1.1
		遍历结束2
	 */

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
//		// 2、遍历List中的每个值
//		for(HashMap<String, String> s : li) {
//			// 2.1 取出当前Map --s
//			// 2.1.1 遍历Map中的每个值
//			for(Map.Entry<String, String> x : s.entrySet()) {
//
//				// (1) 取出当前Map中的Entry --x
//				// a. 文件全路径 = "C:\\temp\\"
//				String ファイルパス="/Users/haoyan/Desktop/data/";
//
//				// b. 文件全路径 += Entry.key
//				ファイルパス += x.getKey()+ ".txt";
//
//				// c. 写入文件的内容 = Map.get("id") + Entry.Vaule;
//				String 写入文件的内容 = s.get("id") + ","+ x.getValue();
//
//				// (2) 调用函数写入文件
//				new 练习7().文件書込(ファイルパス, 写入文件的内容);
//			}
//		}
	}
}
