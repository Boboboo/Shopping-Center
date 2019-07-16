package com.bobo.entity;

import java.util.Date;

public class ShopCategory {
	
	private Long shopCatagoryId;
	private String shopCategoryname;
	private String shopCategoryDesc;
	private String shopCategoryImg;
	private Integer priority; //To identify rank in the front end page
	private Date createTime;
	private Date lastEditTime;
	private ShopCategory parent;
	
	public Long getShopCatagoryId() {
		return shopCatagoryId;
	}
	public void setShopCatagoryId(Long shopCatagoryId) {
		this.shopCatagoryId = shopCatagoryId;
	}
	public String getShopCategoryname() {
		return shopCategoryname;
	}
	public void setShopCategoryname(String shopCategoryname) {
		this.shopCategoryname = shopCategoryname;
	}
	public String getShopCategoryDesc() {
		return shopCategoryDesc;
	}
	public void setShopCategoryDesc(String shopCategoryDesc) {
		this.shopCategoryDesc = shopCategoryDesc;
	}
	public String getShopCategoryImg() {
		return shopCategoryImg;
	}
	public void setShopCategoryImg(String shopCategoryImg) {
		this.shopCategoryImg = shopCategoryImg;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public ShopCategory getParent() {
		return parent;
	}
	public void setParent(ShopCategory parent) {
		this.parent = parent;
	}
	

}
