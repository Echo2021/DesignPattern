package com.test.goods.coupon;

public class CouponService {

	public CouponResult sendCoupon(String uId,String couponNum,String uuid) {
		
		System.out.println("发放优惠券:"+uId+","+couponNum+","+","+uuid);
		
		return new CouponResult("0000","发送成功");
	}
}
