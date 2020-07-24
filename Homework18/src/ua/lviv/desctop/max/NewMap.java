package ua.lviv.desctop.max;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class NewMap {
	Scanner sc = new Scanner(System.in);
	Map<Integer, MyEntry<String, String>> map = new HashMap<>();

	public void addValue() {
		System.out.println("Enter new key(int):");
		int key = sc.nextInt();
		System.out.println("Enter firs value of map values: ");
		String a = sc.next().toLowerCase();
		System.out.println("Enter second value of map values: ");
		String b = sc.next().toLowerCase();
		map.put(key, new MyEntry<String, String>(a, b));
		System.out.println("Your map consist of: " + map);

	}

	public void removeValueFromKey() {
		System.out.println("Your map consist of: " + map);
		System.out.println("Enter  key(int):");
		int key = sc.nextInt();
		map.remove(key);
		System.out.println("At now your map consist of: " + map);

	}

	public void removeObjectFromValue() {

		System.out.println("Your map consist of: " + map);
		System.out.println("Enter first value of map:");
		String f = sc.next().toLowerCase();
		System.out.println("Enter second value of map:");
		String s = sc.next().toLowerCase();
//	Iterator<Entry<Integer, MyEntry<String, String>>> iterator = map.entrySet().iterator();
//	while(iterator.hasNext()) {
//		Entry<Integer, MyEntry<String, String>> next = iterator.next();
//		MyEntry<String, String> value = next.getValue();
//		if(value.equals(new MyEntry<String, String>(f, s))) {
//			iterator.remove();
//		}
//	}
//	map.values().removeIf(value -> !value.equals(new MyEntry<String, String>(f, s)));
		// while (map.values().remove(new MyEntry<String, String>(f, s)));
		// map.values().remove(new MyEntry<String, String>(f, s));
		// map.values().removeIf(new MyEntry<String, String>(f, s)::equals);
		System.out.println("At now your map consist of: " + map);
	}

	public void showKeys() {

		System.out.println("Your keys: " + map.keySet());
	}

	public void showValues() {
		System.out.println("Your values: " + map.values());
	}

	public void showMap() {
		System.out.println("Your map is: " + map);
	}

}
