package com.karthik.JavaSimpleDemo.designPattern;

import java.util.HashMap;
import java.util.Map;

public abstract class ItemPrototype implements Cloneable {

	private String title;
	private double price;
	private String url;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}

class Movie extends ItemPrototype {
	private String runtime;

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "Movie [runtime=" + runtime + ", getTitle()=" + getTitle() + ", getPrice()=" + getPrice() + ", getUrl()="
				+ getUrl() + "]";
	}
	
	
	
	
}

class Book extends ItemPrototype {

	private int numberOfPages;

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
}

class Registory {
	private Map<String, ItemPrototype> items = new HashMap<String, ItemPrototype>();

	public Registory() {
		loadItem();
	}
	public ItemPrototype createItem(String key) throws CloneNotSupportedException{
		ItemPrototype itemPrototype=null;
		itemPrototype= (ItemPrototype) items.get(key).clone();
		return itemPrototype;
	}

	private void loadItem() {
		Movie movie = new Movie();
		movie.setTitle("Movie");
		movie.setPrice(23);
		movie.setRuntime("2 hours");
		movie.setUrl("movieUrl");
		items.put("Movie", movie);

		Book book = new Book();
		book.setTitle("Book");
		book.setPrice(9);
		book.setNumberOfPages(400);
		book.setUrl("bookUrl");
		items.put("Book", book);
	}

}

class TesterItem{
	public static void main(String[] args) throws CloneNotSupportedException {
		Registory registory=new Registory();
		Movie movie = (Movie) registory.createItem("Movie");
		movie.setTitle("My movie");
		System.out.println(movie);
		System.out.println(movie.hashCode());
		
		Movie movie1 = (Movie) registory.createItem("Movie");
		System.out.println(movie1);
		System.out.println(movie1.hashCode());
		
		
	}
}