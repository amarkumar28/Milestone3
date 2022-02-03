package q1;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Question1 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		System.out.println("------printing map------");
		
		//		1. print map using stream
//		map.entrySet().stream().forEach(m -> System.out.println(m.getKey() + " " + m.getValue()));

		//		2. print only that recrods that contain key contains raj
		List<Entry<String,Integer>> containsRaj=map
				.entrySet()
				.stream()
				.filter(m -> m.getKey().contains("raj"))
				.collect(Collectors.toList());
		
//		System.out.println(containsRaj);
		
		//		3. print map sorted by key
		
		List<Entry<String,Integer>> sortedByKey=map
				.entrySet()
				.stream()
				.sorted((a,b) -> a.getKey().compareTo(b.getKey()))
				.collect(Collectors.toList());
		
//		map.entrySet()
//		.stream()
//		.sorted(Map.Entry.comparingByValue())
//		.forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));


//		System.out.println(sortedByKey);
		
		//		4. print map sorted by values
		List<Entry<String,Integer>> sortedByValue=map
				.entrySet()
				.stream()
				.sorted((a,b) -> a.getValue().compareTo(b.getValue()))
				.collect(Collectors.toList());
		
//		System.out.println(sortedByValue);
		

		//		5. print map reverse sorted by the key
		List<Entry<String,Integer>> sortedByKeyReverse=map
				.entrySet()
				.stream()
				.sorted((a,b) -> b.getKey().compareTo(a.getKey()))
				.collect(Collectors.toList());
		
		System.out.println(sortedByKeyReverse);
	
	}
}