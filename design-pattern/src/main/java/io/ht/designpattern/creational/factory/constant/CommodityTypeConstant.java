package io.ht.designpattern.creational.factory.constant;

public enum CommodityTypeConstant {
    GOOD(1,"商品"),COUPON(2,"优惠卷"),CARD(3,"卡片");
    private CommodityTypeConstant(int code , String name){
        this.code = code;
        this.name = name;
    }
    private int code;
    private String name;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
