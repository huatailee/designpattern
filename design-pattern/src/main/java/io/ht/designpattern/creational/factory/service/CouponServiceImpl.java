package io.ht.designpattern.creational.factory.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("couponService")
@Slf4j
public class CouponServiceImpl implements ICommodityService {
    @Override
    public void sendCommodityService() {
     log.info("send Coupon");
    }
}
