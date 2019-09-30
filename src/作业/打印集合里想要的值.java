package 作业;

import java.util.List;
import java.util.Map;

public class 打印集合里想要的值 {

	public static void main(String[] args) {
		List<Map> a = 调用函数.函数9();  //调用函数9给listmap a
		for (int c = 0; c < a.size(); c++) { //循环list a里的c角标
			Map d = a.get(c); //取得list a里的c角标给map d
			d.get("技术"); //取得map d里的值"技术"
			List<String> e = (List<String>) d.get("技术"); //把"技术"强转成list string型e
			for (int f = 0; f < e.size(); f++) { //循环list string e的值
				String g = e.get(f); //把list string e的值f转成string 给
				if (g.equals("java")) { //把g和java进行比较，如果是
					System.out.println(d.get("name")); //就把是Java的名字打印出来
				}

			}

		}
	}
}
//调用函数9（本身就是listmap)--给listmap a--转成map d--转成liststring--转成string g