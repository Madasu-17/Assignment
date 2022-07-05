package com.zensar.coupon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.coupon.service.CouponService;
import com.zensar.coupon.entity.Coupon;

@RestController
@RequestMapping("/coupon")
public class CupounController {
	@Autowired
	private CouponService couponService;

	@GetMapping(value = "/coupon/{couponId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Coupon getCoupon(@PathVariable("coupon") int CouponId) {
		return couponService.getCoupon(CouponId);
	}

	@GetMapping(value = "/coupons", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<Coupon> getCoupons() {
		return couponService.getCoupons();
	}

	@PostMapping(value = "/coupons", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public void insertCoupon(@RequestBody Coupon coupon) {
		couponService.insertCoupon(coupon);

	}

	@PutMapping(value = "coupons/{couponId}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public void updateCoupon(@PathVariable("couponId") int CouponId, @RequestBody Coupon coupon) {
		couponService.updateCoupon(CouponId, coupon);

	}

	@DeleteMapping("coupons/{couponId}")
	public void deleteCoupon(@PathVariable("couponId") int CouponId) {
		couponService.deleteCoupon(CouponId);
	}
}
