package com.rcoolone.onlineshopping.db.dao;

import com.rcoolone.onlineshopping.db.po.OnlineShoppingCommodity;

public interface OnlineShoppingCommodityDao {
    int insertCommodity(OnlineShoppingCommodity record);

    int deleteCommodity(int commodityid);

    OnlineShoppingCommodity queryCommodityById(int commodityid);
}
