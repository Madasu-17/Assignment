package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entity.Coupons;
import com.zensar.repository.CouponsRepository;
@Service
public class CouponsServiceImpl implements CouponsService {
	@Autowired
	private CouponsRepository couponsRepository;

	@Override
	public Coupons getCoupon(int couponId) {
		
		return couponsRepository.findById(couponId).get();
	}

	@Override
	public List<Coupons> getAllCoupons() {
		
		return couponsRepository.findAll();
	}

	@Override
	public void insertCoupon(Coupons coupons) {
		couponsRepository.save(coupons);
		
	}

	@Override
	public void updateCoupon(int couponId, Coupons coupons) {
		couponsRepository.save(coupons);
		
	}

	@Override
	public void deleteCoupon(int couponId) {
		couponsRepository.deleteById(couponId);
		
	}

}
