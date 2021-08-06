package com.kh.model.vo;

// PC방 메뉴 목록 관리 클래스
public class Product {
	private String productName;
	private int price;
	
	public Product() {}
	
	public Product(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + "]";
	}
	
	

}
