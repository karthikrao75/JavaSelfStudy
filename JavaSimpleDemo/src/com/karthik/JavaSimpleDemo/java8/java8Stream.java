package com.karthik.JavaSimpleDemo.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class java8Stream {

	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		List<String> li = new ArrayList<>();
		li.add("35");
		li.add("20");
		li.add("10");
		li.add("5");
		map.put("95-90.01", li);

		Map<String, List<String>> map1 = new HashMap<>();
		List<String> li1 = new ArrayList<>();
		li1.add("35");
		li1.add("20");
		li1.add("10");
		li1.add("5");
		map1.put("95-90.01", li);

		List<TableData> list = new ArrayList<>();
		TableData tab = new TableData();
		tab.setLtv("95-90.01");
		tab.setCoverage("35");
		list.add(tab);
		TableData tab1 = new TableData();
		tab1.setLtv("95-90.01");
		tab1.setCoverage("25");
		list.add(tab1);
		TableData tab2 = new TableData();
		tab2.setLtv("85-90.01");
		tab2.setCoverage("15");
		list.add(tab2);
		TableData tab3 = new TableData();
		tab3.setLtv("90-85.01");
		tab3.setCoverage("25");
		list.add(tab3);
		TableData tab4 = new TableData();
		tab4.setLtv("85-90.01");
		tab4.setCoverage("15");
		list.add(tab4);
		Map<String, Set<String>> namesByCity1 =list.stream().collect(Collectors.groupingBy(TableData::getLtv,
				 Collectors.mapping(TableData::getCoverage, Collectors.toSet())));
		System.out.println(namesByCity1);
	}
}
