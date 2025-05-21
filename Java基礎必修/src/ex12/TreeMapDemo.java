package ex12;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		var tmap = new TreeMap<String, String>();  // 指定 key 與 value 為 String
		tmap.put("260", "宜蘭");
		tmap.put("970", "花蓮");
		tmap.put("500", "彰化");
		tmap.put("900", "屏東");
		tmap.put("600", "嘉義");

		System.out.println("集合內容: " + tmap);
		System.out.println("集合的元素大小: " + tmap.size());

		String key = tmap.firstKey();  // ✅ 取得第一個 key
		System.out.println("集合的第一個郵遞區號: " + key);
		System.out.println("集合的第一個地名: " + tmap.get(key));

		String lastKey = tmap.lastKey();
		System.out.println("集合的最後一個郵遞區號: " + lastKey);
		System.out.println("集合的最後一個地名: " + tmap.get(lastKey));

		System.out.println("郵遞區號大於等於600的元素集合: " + tmap.tailMap("600"));  // ✅ 字串比較
	}
}
