package com.zensar.service;

import java.util.List;

import com.zensar.entity.Coupons;

public interface CouponsService {
	
	public Coupons getCoupon(int couponId);
	
	public List<Coupons> getAllCoupons();
	
	public void insertCoupon(Coupons coupons);
	
	public void updateCoupon(int couponId, Coupons coupons);
	
	public void deleteCoupon(int couponId);

}
