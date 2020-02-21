package com.karthik.JavaSimpleDemo.designPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class PageFactory {

}

abstract class Website {
	protected List<PageFactory> pages = new ArrayList<>();

	public List<PageFactory> getPages() {
		return pages;
	}

	public Website() {
		this.createWebsite();
	}

	public abstract void createWebsite();
}

class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new ContactPage());
	}
}

class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());

	}

}

class WebsiteFactory {
	public static Website getWebsite(String siteType) {
		if (siteType.equals("blog")) {
			return new Blog();
		}
		return new Shop();
	}
}

class ContactPage extends PageFactory {

}

class CartPage extends PageFactory {

}


class FactoryjTester{
	public static void main(String[] args) {
		Website web=WebsiteFactory.getWebsite("shop");
		System.out.println(web.getPages());
	}
}