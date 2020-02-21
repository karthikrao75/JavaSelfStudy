package com.karthik.JavaSimpleDemo.designPattern;

public class LunchBuilder {

	public static class Builder {
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;

		public LunchBuilder build() {
			return new LunchBuilder(this);
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

	}

	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;

	public LunchBuilder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}

	// Normal implementation
	
//	  private String bread; private String condiments; private String dressing;
//	  private String meat;
//	  
//	public LunchBuilder(String dressing, String meat) {
//		super();
//		this.dressing = dressing;
//		this.meat = meat;
//	}
//
//	public LunchBuilder(String condiments, String dressing, String meat) {
//		super();
//		this.condiments = condiments;
//		this.dressing = dressing;
//		this.meat = meat;
//	}
//
//	public LunchBuilder(String bread, String condiments, String dressing, String meat) {
//		super();
//		this.bread = bread;
//		this.condiments = condiments;
//		this.dressing = dressing;
//		this.meat = meat;
//	}
//
//	public String getBread() {
//		return bread;
//	}
//
//	public void setBread(String bread) {
//		this.bread = bread;
//	}
//
//	public String getCondiments() {
//		return condiments;
//	}
//
//	public void setCondiments(String condiments) {
//		this.condiments = condiments;
//	}
//
//	public String getDressing() {
//		return dressing;
//	}
//
//	public void setDressing(String dressing) {
//		this.dressing = dressing;
//	}
//
//	public String getMeat() {
//		return meat;
//	}
//
//	public void setMeat(String meat) {
//		this.meat = meat;
//	}
	 
	
	
	public static void main(String[] args) {
		LunchBuilder.Builder builder=new Builder();
		
		builder.bread("bread").condiments("condiments").dressing("dressing").meat("meat");
		
		LunchBuilder lunchBuilder=builder.build();
		
		System.out.println(lunchBuilder.getBread());
		System.out.println(lunchBuilder.getCondiments());
		System.out.println(lunchBuilder.getDressing());
		System.out.println(lunchBuilder.getMeat());
	}
}
