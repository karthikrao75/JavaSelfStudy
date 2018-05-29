package com.karthik.JavaSimpleDemo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class CollectioForEach {

	// forEach for collection which takes consumer as argument.
	/*
	 * iterable interface below method is implemented as default method. default
	 * void forEach(Consumer<? super T> action) {
	 * Objects.requireNonNull(action); for (T t : this) { action.accept(t); } }
	 */

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("karthik");
		li.add("srikanth");
		li.forEach(i -> System.out.println(i));

		li.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});

		myConsumer consumer = new myConsumer();
		li.forEach(consumer);
	}
}

class myConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);

	}

}