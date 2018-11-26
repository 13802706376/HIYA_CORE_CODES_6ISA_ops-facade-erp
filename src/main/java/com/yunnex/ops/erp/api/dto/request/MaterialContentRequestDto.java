package com.yunnex.ops.erp.api.dto.request;

import yunnex.common.core.dto.BaseDto;

/**
 * 订单物料内容DTO
 */
public class MaterialContentRequestDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    /**
     * 物料布置场景类型
     */
    private Integer scenarioType;
    /**
     * 物料种类显示名称
     */
    private String materialTypeName;
    /**
     * 材质
     */
    private String materialQuality;
    /**
     * 正面名称
     */
    private String frontName;
    /**
     * 反面名称
     */
    private String reverseName;
    /**
     * 正面图片
     */
    private String frontImage;
    /**
     * 反面图片
     */
    private String reverseImage;
    /**
     * 图片资源URL
     */
    private String resourceUrl;
    /**
     * 尺寸大小
     */
    private String size;
    /**
     * 物料数量
     */
    private Integer materialAmount;


    public String getMaterialQuality() {
        return materialQuality;
    }

    public void setMaterialQuality(String materialQuality) {
        this.materialQuality = materialQuality;
    }

    public Integer getScenarioType() {
        return scenarioType;
    }

    public void setScenarioType(Integer scenarioType) {
        this.scenarioType = scenarioType;
    }

    public String getMaterialTypeName() {
        return materialTypeName;
    }

    public void setMaterialTypeName(String materialTypeName) {
        this.materialTypeName = materialTypeName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getMaterialAmount() {
        return materialAmount;
    }

    public void setMaterialAmount(Integer materialAmount) {
        this.materialAmount = materialAmount;
    }

    public String getFrontImage() {
        return frontImage;
    }

    public void setFrontImage(String frontImage) {
        this.frontImage = frontImage;
    }

    public String getReverseImage() {
        return reverseImage;
    }

    public void setReverseImage(String reverseImage) {
        this.reverseImage = reverseImage;
    }

    public String getFrontName() {
        return frontName;
    }

    public void setFrontName(String frontName) {
        this.frontName = frontName;
    }

    public String getReverseName() {
        return reverseName;
    }

    public void setReverseName(String reverseName) {
        this.reverseName = reverseName;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }
}
