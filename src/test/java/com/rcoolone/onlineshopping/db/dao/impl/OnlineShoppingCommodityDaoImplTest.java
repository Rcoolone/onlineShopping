package com.rcoolone.onlineshopping.db.dao.impl;

import com.rcoolone.onlineshopping.db.dao.OnlineShoppingCommodityDao;
import com.rcoolone.onlineshopping.db.po.OnlineShoppingCommodity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OnlineShoppingCommodityDaoImplTest {
    @Resource
    OnlineShoppingCommodityDao commodityDao;

    @Test
    void insertCommodity() {
        OnlineShoppingCommodity Iphone = OnlineShoppingCommodity.builder()
                .commodityId(123)
                .price((long)1999.99)
                .totalStock(5)
                .availeblStock(3)
                .name("Iphone14")
                .sellerId(1)
                .build();
        commodityDao.deleteCommodity(123);
        commodityDao.insertCommodity(Iphone);
    }

    @Test
    void deleteCommodity() {
    }

    @Test
    void queryCommodityById() {
    }
}