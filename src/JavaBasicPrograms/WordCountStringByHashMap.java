package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class WordCountStringByHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WordCountStringByHashMap hm = new WordCountStringByHashMap();
		
		String str = "the  Count the num by Using HashMap";
	//	System.out.println(str.length());
		
		HashMap<String , Integer> Map = new HashMap<String,Integer>();
		
		String []splitBy =str.split(" ");
		
		for(int i=0;i<splitBy.length;i++) {
			
			if(Map.containsKey(splitBy[i])) {
				int count = Map.get(splitBy[i]);
				Map.put(splitBy[i], count+1);
			}else {
				Map.put(splitBy[i], 1);
			}
		}
		System.out.println(Map);
	}

}
