package com.yunnex.ops.erp.api.dto.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import yunnex.common.core.dto.BaseDto;

/**
 * 订单物料DTO
 */
public class OrderMaterialRequestDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    /**
     * 贝虎订单号
     */
    private String orderNumber;
    /**
     * 掌贝账号
     */
    private String zhangbeiId;
    /**
     * 易商订单ID
     */
    private Long ysOrderId;
    /**
     * 易商订单购买时间
     */
    private Date ysOrderBuyTime;
    /**
     * 易商订单实际支付金额，单位分
     */
    private Long ysOrderRealPrice;

    /**
     * 订单联系人
     */
    private String orderLinkMan;
    /**
     * 订单联系电话
     */
    private String orderLinkPhone;
    /**
     * 订单收货地址
     */
    private String orderReceiveAddress;
    /**
     * 物料包路径
     */
    private String materialPackageUrl;

    /**
     * 物料内容（清单）
     */
    private List<MaterialContentRequestDto> materialContents = new ArrayList<>();

    // 订单类别，首次/更新
    private String orderCategory;


    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getYsOrderId() {
        return ysOrderId;
    }

    public void setYsOrderId(Long ysOrderId) {
        this.ysOrderId = ysOrderId;
    }

    public String getZhangbeiId() {
        return zhangbeiId;
    }

    public void setZhangbeiId(String zhangbeiId) {
        this.zhangbeiId = zhangbeiId;
    }

    public Date getYsOrderBuyTime() {
        return ysOrderBuyTime;
    }

    public void setYsOrderBuyTime(Date ysOrderBuyTime) {
        this.ysOrderBuyTime = ysOrderBuyTime;
    }

    public Long getYsOrderRealPrice() {
        return ysOrderRealPrice;
    }

    public void setYsOrderRealPrice(Long ysOrderRealPrice) {
        this.ysOrderRealPrice = ysOrderRealPrice;
    }

    public String getOrderLinkMan() {
        return orderLinkMan;
    }

    public void setOrderLinkMan(String orderLinkMan) {
        this.orderLinkMan = orderLinkMan;
    }

    public String getOrderLinkPhone() {
        return orderLinkPhone;
    }

    public void setOrderLinkPhone(String orderLinkPhone) {
        this.orderLinkPhone = orderLinkPhone;
    }

    public String getOrderReceiveAddress() {
        return orderReceiveAddress;
    }

    public void setOrderReceiveAddress(String orderReceiveAddress) {
        this.orderReceiveAddress = orderReceiveAddress;
    }

    public String getMaterialPackageUrl() {
        return materialPackageUrl;
    }

    public void setMaterialPackageUrl(String materialPackageUrl) {
        this.materialPackageUrl = materialPackageUrl;
    }

    public List<MaterialContentRequestDto> getMaterialContents() {
        return materialContents;
    }

    public void setMaterialContents(List<MaterialContentRequestDto> materialContents) {
        this.materialContents = materialContents;
    }

    public String getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory;
    }
}
