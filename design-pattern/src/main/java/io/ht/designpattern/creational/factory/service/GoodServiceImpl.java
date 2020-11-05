package io.ht.designpattern.creational.factory.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("goodService")
@Slf4j
public class GoodServiceImpl implements ICommodityService {

    @Override
    public void sendCommodityService() {
    log.info("send good");
    }
}
