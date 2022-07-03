package com.StockModels;

public class Product {
	private int PID;
	private String product_name;
	private double product_price;
	private String product_Brand;
	private String SellerId;
	private String ProductInfo;
	private String ProductType;
	private String ProductQuality;
	
	public Product(int pID, String product_name, double product_price, String product_Brand, String sellerId,
			String productInfo, String productType, String productQuality) {
		super();
		PID = pID;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_Brand = product_Brand;
		SellerId = sellerId;
		ProductInfo = productInfo;
		ProductType = productType;
		ProductQuality = productQuality;
	}

	public int getPID() {
		return PID;
	}

	public String getProduct_name() {
		return product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public String getProduct_Brand() {
		return product_Brand;
	}

	public String getSellerId() {
		return SellerId;
	}

	public String getProductInfo() {
		return ProductInfo;
	}

	public String getProductType() {
		return ProductType;
	}

	public String getProductQuality() {
		return ProductQuality;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public void setProduct_Brand(String product_Brand) {
		this.product_Brand = product_Brand;
	}

	public void setSellerId(String sellerId) {
		SellerId = sellerId;
	}

	public void setProductInfo(String productInfo) {
		ProductInfo = productInfo;
	}

	public void setProductType(String productType) {
		ProductType = productType;
	}

	public void setProductQuality(String productQuality) {
		ProductQuality = productQuality;
	}
	
	
	
	
	


}
