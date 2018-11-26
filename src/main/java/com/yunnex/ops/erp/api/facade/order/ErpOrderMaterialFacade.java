package com.yunnex.ops.erp.api.facade.order;

import com.yunnex.ops.erp.api.dto.request.OrderMaterialRequestDto;

import yunnex.common.core.dto.ApiResult;

/**
 * 订单物料同步接口
 */
public interface ErpOrderMaterialFacade {

    /**
     * 推送订单物料内容
     * 
     * @param requestDto 订单物料内容
     * @return
     */
    ApiResult<Void> pushOrderMaterial(OrderMaterialRequestDto requestDto);

    /**
     * 同步订单的物料制作状态
     * 
     * @param ysOrderId 物料订单ID
     * @return 订单对应的物料制作状态
     */
    ApiResult<String> syncOrderMaterialStatus(Long ysOrderId);

}
