package test;

import java.util.HashMap;

public class HashMapSample {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		//追加
		hm.put("GK", "中村");
        hm.put("DF", "岩波");
        hm.put("MF", "南野");
        hm.put("FW", "浅野");
		
		String menber = hm.get("GK");
		System.out.println(menber);
		
		hm.remove("GK");
		
		int size = hm.size();
		System.out.println(size);
		
		for(String key : hm.keySet()){
			String value = hm.get(key);
			System.out.println(key + "：" + value);
		}
		
		hm.clear();
		size = hm.size();
		System.out.println(size);
	}

}
