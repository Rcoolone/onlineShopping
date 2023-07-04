package com.rcoolone.onlineshopping.db.mappers;

import com.rcoolone.onlineshopping.db.po.OnlineShoppingCommodity;

public interface OnlineShoppingCommodityMapper {
    int deleteByPrimaryKey(Integer commodityId);

    int insert(OnlineShoppingCommodity record);

    int insertSelective(OnlineShoppingCommodity record);

    OnlineShoppingCommodity selectByPrimaryKey(Integer commodityId);

    int updateByPrimaryKeySelective(OnlineShoppingCommodity record);

    int updateByPrimaryKey(OnlineShoppingCommodity record);
}