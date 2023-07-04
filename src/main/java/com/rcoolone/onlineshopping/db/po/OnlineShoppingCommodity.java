package com.rcoolone.onlineshopping.db.po;

import lombok.Builder;

@Builder
public class OnlineShoppingCommodity {
    private Integer commodityId;

    private String name;

    private String description;

    private Long price;

    private Integer totalStock;

    private Integer availeblStock;

    private Integer sellerId;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    public Integer getAvaileblStock() {
        return availeblStock;
    }

    public void setAvaileblStock(Integer availeblStock) {
        this.availeblStock = availeblStock;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }
}