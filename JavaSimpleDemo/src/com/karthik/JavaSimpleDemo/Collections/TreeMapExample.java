package com.karthik.JavaSimpleDemo.Collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	// underline data structure of tree map is RED_BLACK Tree
	// implements sorted Map, navigable Map,cloneable,serializable
	// extends AbstractMap
	// duplicate keys are not allowed ,but duplicate values.
	// for default natural sorting object should be homogeneous and comparable.
	// for customized sorting object can be heterogeneous and non comparable.
	// comparison is done based on keys not values.

	// cannot insert null as key -in 1.7 and above
	// an insert null as only element in 1.6 and 1.4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> m = new TreeMap<>();
		m.put(3, "jai");
		m.put(4, "amnu");
		m.put(2, "srikanth");
		m.put(1, "karthik");
		System.out.println(m);
		// {1=karthik, 2=srikanth, 3=jai, 4=amnu} --default sorting order

		// constructor using customized comparator
		TreeMap<Integer, String> m1 = new TreeMap<>(new MyComp());
		m1.putAll(m);
		System.out.println(m1);
		// {4=amnu, 3=jai, 2=srikanth, 1=karthik}

		// m1.put(null, "god");
		// null pointer exception

		Entry<Integer, String> s = m1.firstEntry();
		System.out.println(s);
		// 4=amnu
		Entry<Integer, String> s1 = m1.lastEntry();
		System.out.println(s1);
		// 1=karthik

		// tailMap with index and inclusive
		System.out.println(m1.tailMap(3, false));
		// {2=srikanth, 1=karthik}--if false will not include 3 ,if true will
		// include 3

		System.out.println(m.subMap(2, false, 4, true));
		// {3=jai, 4=amnu}

		System.out.println(m.isEmpty());
		// false

		System.out.println(m.containsKey(2));
		// true

		System.out.println(m.containsValue("karthik"));
		// true

		System.out.println(m.get(1));
		// karthik

		System.out.println(m.remove(5));
		// null

		System.out.println(m.size());
		// 4
		System.out.println(m.ceilingEntry(3));
		// 3=jai --will return entry for key greater than or equal .

		System.out.println(m.ceilingKey(3));
		// 3 --will return key greater than or equal to given key.

		NavigableSet<Integer> n = m.descendingKeySet();
		System.out.println(n);
		// [4, 3, 2, 1]

		NavigableMap<Integer, String> n1 = m.descendingMap();
		System.out.println(n1);
		// {4=amnu, 3=jai, 2=srikanth, 1=karthik}

		System.out.println(m.floorEntry(3));
		// 3=jai --will return entry for key lesser than or equal .

		System.out.println(m.ceilingKey(3));
		// 3 --will return key lesser than or equal to given key.

		// sorted set implemented methods
		System.out.println(m1.firstKey());
		// 4
		System.out.println(m1.lastKey());
		// 1
		System.out.println(m1.headMap(2));
		// {4=amnu, 3=jai}
		System.out.println(m1.tailMap(2));
		// {2=srikanth, 1=karthik}
		System.out.println(m.subMap(2, 4));
		// {2=srikanth, 3=jai}-default from key will be inclusive

		Collection<String> c = m1.values();
		System.out.println(c);
		// [amnu, jai, srikanth, karthik]

		Set<Integer> s11 = m1.keySet();
		System.out.println(s11);
		// [4, 3, 2, 1]

		Set<Map.Entry<Integer, String>> s12 = m1.entrySet();
		System.out.println(s12);
		// [4=amnu, 3=jai, 2=srikanth, 1=karthik]

		System.out.println(m1.comparator());
		// com.karthik.JavaSimpleDemo.Collections.MyComparator@702d2da4
		// will return comparator used for sorting if not returns null

	}

}

class MyComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}

}
