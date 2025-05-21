package ex12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		var data = List.of("Angel", "路小璇", "培陪", "Wendy", "芭芭樂");
		for(String p : data)
			alist.add(p);
		System.out.println("顯示alist集合物件初始元素");
		System.out.println(alist);
			
		Collections.sort(alist);
		System.out.println("\n排序後的元素");
		System.out.println(alist);
		
		Collections.reverse(alist);
		System.out.println("\n反轉排列的元素");
		System.out.println(alist);
	}
}
