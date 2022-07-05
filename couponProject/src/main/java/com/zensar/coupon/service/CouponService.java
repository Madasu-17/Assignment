package com.zensar.coupon.service;

import java.util.List;

import com.zensar.coupon.entity.Coupon;

public interface CouponService {
	public Coupon getCoupon(int CouponId);

	public List<Coupon> getCoupons();

	public void insertCoupon(Coupon coupon);

	public void updateCoupon(int CouponId, Coupon coupon);

	public void deleteCoupon(int CouponId);
}