package com.rcoolone.onlineshopping.db.mappers;

import com.rcoolone.onlineshopping.db.po.OnlineShoppingUser;

public interface OnlineShoppingUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(OnlineShoppingUser record);

    int insertSelective(OnlineShoppingUser record);

    OnlineShoppingUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(OnlineShoppingUser record);

    int updateByPrimaryKeyWithBLOBs(OnlineShoppingUser record);

    int updateByPrimaryKey(OnlineShoppingUser record);
}