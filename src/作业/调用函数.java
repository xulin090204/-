package 作业;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class 调用函数 {

	public static List 函数9() {
		List<Map> li =  函数7();                  //调用函数7给list，li

			List 技术list1 = new ArrayList();//新建  技术list1
					技术list1.add("java");    //给技术list1增加赋值
					技术list1.add("posgres");
			Map map0 = li.get(0);           //取得集合li，0位上的地址给map0
			map0.put("技术", 技术list1);       //put是增加值。给map0上增加已经增加好的值的技术list1


			//

			List 技术list2 = new ArrayList();
					技术list2.add("spring");
					技术list2.add("windows");
			Map map1 = li.get(1);
			map1.put("技术", 技术list2);

			//

			List 技术list3 = new ArrayList();
					技术list3.add("java");

			Map map2 = li.get(2);
			map2.put("技术", 技术list3);

               //


			List 技术list4 = new ArrayList();
					技术list4.add("linux");
					技术list4.add("windows");
			Map map3 = li.get(3);

			//System.out.println( map3 );     //打印集合li,map3 上原来的值（也是li角标3的值）

			map3.put("技术", 技术list4);

           //


			List 技术list5 = new ArrayList();
					技术list5.add("c#");

			Map map4 = li.get(4);
			map4.put("技术", 技术list5);


			//System.out.println( map3 );     //打印集合li,map3 上的值（也是li角标3的值）
			return li;
	}

	private static List<Map> 函数7() {




		return 函数7.函数7();

	}




}
