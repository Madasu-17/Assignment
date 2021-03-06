package com.zensar.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zensar.entity.Coupon;

@FeignClient("GATEWAY-SERVICE")  //GATWAY-SERVICE is an ID of whom we want to call.
public interface CouponRestClient {
	@GetMapping("/coupons/{couponCode}")
	Coupon getCoupon(@PathVariable("couponCode") String couponCode);

}
