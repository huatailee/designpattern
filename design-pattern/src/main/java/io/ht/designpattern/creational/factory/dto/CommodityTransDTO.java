package io.ht.designpattern.creational.factory.dto;

import java.util.Map;

public class CommodityTransDTO {
    private int CommodityType ;
    private String customerName;
    private String customerId;
    private Map<String,String> extMap;

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }

    public int getCommodityType() {
        return CommodityType;
    }

    public void setCommodityType(int commodityType) {
        CommodityType = commodityType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
