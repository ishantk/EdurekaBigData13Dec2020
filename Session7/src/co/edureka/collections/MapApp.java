package co.edureka.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapApp {

	public static void main(String[] args) {
		
		//Map<String, Integer> map = new HashMap<String, Integer>();
			//   key 	value
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		//LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		
		map.put("maharashtra", 192000);
		map.put("delhi", 21000);
		map.put("punjab", 12000);
		map.put("goa",2000);
		map.put("karnataka", 22000);
		
		map.put("punjab", 32000); // update operation -> if we use the same key again, data will be updated
		
		System.out.println("MAP IS: ");
		System.out.println(map);
		
		System.out.println("SIZE OF MAP IS: "+map.size());
		
		if(map.containsKey("punjab")) {
			System.out.println("PUNJAB is in the MAP");
		}
		
		if(map.containsValue(22000)) {
			System.out.println("22000 is in the MAP");
		}
		
		Integer cases = map.get("punjab");
		System.out.println("cases in punjab are: "+cases);

		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println();
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		System.out.println(entries);
		
		Iterator<Entry<String, Integer>> itr = entries.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey()+"  |  "+entry.getValue());
		}
		
	}

}
