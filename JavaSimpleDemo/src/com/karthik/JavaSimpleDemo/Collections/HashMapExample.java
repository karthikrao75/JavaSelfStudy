package com.karthik.JavaSimpleDemo.Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	// underline data structure is hashtable
	// insertion order is not maintained
	// heterogeneous ,null key only one,null value is allowed any number of
	// time.
	// implements serializable cloneable ,from java 1.2
	// default size 16,fill ratio 0.75
	// hashMap is not synchronized that is it is not thread safe but Hashtable
	// is

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> m = new HashMap<>();
		m.put(1, "karthik");
		m.put(2, "srikanth");
		m.put(3, "jai");
		m.put(4, "amnu");
		// put method will return object for duplicate key(previous value) if
		// not will get null.

		System.out.println(m);
		// {1=karthik, 2=srikanth, 3=jai, 4=amnu}

		// constructor with default initial capacity
		HashMap<Integer, String> m1 = new HashMap<>(10);
		m1.put(1, "karthik");

		// constructor with initial capacity and fill ratio
		HashMap<Integer, String> m2 = new HashMap<>(10, 0.90f);
		m2.putAll(m);

		// constructor that takes map
		HashMap<Integer, String> m3 = new HashMap<>(m1);

		System.out.println(m.containsKey(1));
		// true

		System.out.println(m3.containsValue("karthik"));
		// true

		System.out.println(m3.isEmpty());
		// false
		System.out.println(m3.size());
		// 1

		Set<Integer> set = m.keySet();
		System.out.println(set);
		// [1, 2, 3, 4]

		Collection<String> collection = m.values();
		System.out.println(collection);
		// [karthik, srikanth, jai, amnu]

		Set<Map.Entry<Integer, String>> s = m.entrySet();
		for (Map.Entry<Integer, String> entry : s) {
			if (entry.getValue().equals("srikanth")) {
				entry.setValue("kk");
				System.out.println(entry.getKey() + " " + entry.getValue());
				// 2 kk
			}

		}
		//make it synchronized
	Collections.synchronizedMap(m);
	}

}
