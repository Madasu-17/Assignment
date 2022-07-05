package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupons {
	@Id
	private int coupondId;
	private String couponCode;
	private Double couponDiscount;
	private String couponExpriyDate;
	public Coupons() {
		super();
	}
	public Coupons(int coupondId, String couponCode, Double couponDiscount, String couponExpriyDate) {
		super();
		this.coupondId = coupondId;
		this.couponCode = couponCode;
		this.couponDiscount = couponDiscount;
		this.couponExpriyDate = couponExpriyDate;
	}
	public int getCoupondId() {
		return coupondId;
	}
	public void setCoupondId(int coupondId) {
		this.coupondId = coupondId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public Double getCouponDiscount() {
		return couponDiscount;
	}
	public void setCouponDiscount(Double couponDiscount) {
		this.couponDiscount = couponDiscount;
	}
	public String getCouponExpriyDate() {
		return couponExpriyDate;
	}
	public void setCouponExpriyDate(String couponExpriyDate) {
		this.couponExpriyDate = couponExpriyDate;
	}
	@Override
	public String toString() {
		return "Coupons [coupondId=" + coupondId + ", couponCode=" + couponCode + ", couponDiscount=" + couponDiscount
				+ ", couponExpriyDate=" + couponExpriyDate + "]";
	}
	
	

}
