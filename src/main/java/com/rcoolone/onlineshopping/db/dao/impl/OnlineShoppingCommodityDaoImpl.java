package com.rcoolone.onlineshopping.db.dao.impl;

import com.rcoolone.onlineshopping.db.dao.OnlineShoppingCommodityDao;
import com.rcoolone.onlineshopping.db.mappers.OnlineShoppingCommodityMapper;
import com.rcoolone.onlineshopping.db.po.OnlineShoppingCommodity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class OnlineShoppingCommodityDaoImpl implements OnlineShoppingCommodityDao {
    @Resource
    OnlineShoppingCommodityMapper mapper;

    @Override
    public int insertCommodity(OnlineShoppingCommodity record) {
        return mapper.insert(record);
    }

    @Override
    public int deleteCommodity(int commodityid) {
        return mapper.deleteByPrimaryKey(commodityid);
    }

    @Override
    public OnlineShoppingCommodity queryCommodityById(int commodityid) {
        return mapper.selectByPrimaryKey(commodityid);
    }


}
