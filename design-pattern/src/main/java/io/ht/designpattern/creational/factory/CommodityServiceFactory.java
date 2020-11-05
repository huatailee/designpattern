package io.ht.designpattern.creational.factory;

import io.ht.designpattern.creational.factory.constant.CommodityTypeConstant;
import io.ht.designpattern.creational.factory.dto.CommodityTransDTO;
import io.ht.designpattern.creational.factory.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityServiceFactory {
    @Autowired
    private ICommodityService cardService;
    @Autowired
    private ICommodityService couponService;
    @Autowired
    private ICommodityService goodService;

    public ICommodityService sendCommodityService(CommodityTransDTO commodityTransDTO){
        if(commodityTransDTO == null) throw new RuntimeException("入参不正确");
        if(CommodityTypeConstant.CARD.getCode() == commodityTransDTO.getCommodityType()){
            return cardService;
        }
        if(CommodityTypeConstant.COUPON.getCode() == commodityTransDTO.getCommodityType()){
            return couponService;
        }
        if(CommodityTypeConstant.GOOD.getCode() == commodityTransDTO.getCommodityType()){
            return goodService;
        }
        throw new RuntimeException("不支持商品类型");
    }
}
