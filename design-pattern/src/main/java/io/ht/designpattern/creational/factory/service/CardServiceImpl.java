package io.ht.designpattern.creational.factory.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("cardService")
@Slf4j
public class CardServiceImpl implements ICommodityService {
    @Override
    public void sendCommodityService() {
        log.info("send card");
    }
}
