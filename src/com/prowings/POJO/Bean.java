package com.prowings.POJO;

public class Bean {
	private Integer property;

	Bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setProperty(Integer property) {
		if (property == 0) {
			return;
		}
		this.property = property;
	}

	public Integer getProperty() {
		if (property == 0) {
			return property;
		}
		return property;
	}

	public static void main(String[] args) {
		Bean bean = new Bean();
		bean.setProperty(20);

		System.out.println("after setting to valid value : " + bean.getProperty());
	}
}
