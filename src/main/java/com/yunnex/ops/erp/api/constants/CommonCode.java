package com.yunnex.ops.erp.api.constants;

import java.io.Serializable;

/**
 * 通用属性
 * 
 * @author caozhijun
 *
 */
public final class CommonCode implements Serializable
{

    /**
     * 0 : 成功
     */
    public static final CommonCode SUCCESS = new CommonCode("0", "成功");

    /**
     * 100001 : 系统异常
     */
    public static final CommonCode SYSTEM_ERROR = new CommonCode("100001", "系统异常");

    /**
     * -1 : 未知错误返回码
     */
    public static final CommonCode UNKNOW_ERROR = new CommonCode("-1", "未知错误返回码");

    /**
     * 100002 : 参数不合法
     */
    public static final CommonCode INVALID_PARAM = new CommonCode("100002", "参数不合法");
    /**
     * 100003 : 超时
     */
    public static final CommonCode TIME_OUT = new CommonCode("100003", "系统内部访问超时");

    /**
     * 100004 : json 字符串不合法
     */
    public static final CommonCode INVALID_JSON_STRING = new CommonCode("100004", "不合法的json串");

    /**
     * 100005 : 资源存在
     */
    public static final CommonCode RESOURCE_EXISTS = new CommonCode("100005", "资源已经存在");

    /**
     * 100006 : 资源不存在
     */
    public static final CommonCode RESOURCE_NOT_EXISTS = new CommonCode("100006", "资源不存在");
    /**
     * 100007 : 不支持的操作
     */
    public static final CommonCode NON_SUPPORTED_OPER = new CommonCode("100007", "不支持的操作");
    /**
     * 100008 : 无权操作
     */
    public static final CommonCode NO_PERMISSION = new CommonCode("100008", "没有权限操作");
    /**
     * 100009 : 未知异常
     */
    public static final CommonCode UNKNOW_EXCEPTION = new CommonCode("100009", "未知异常");
    private static final long serialVersionUID = 4001480091436669438L;

    private String code;
    private String message;

    /**
     * 构造函数
     * 
     * @param code
     * @param message
     */
    public CommonCode(String code, String message)
    {
        this.code = code;
        this.message = message;
    }

    /**
     * 错误码一致，message 不一致
     * 
     * @param responseCode
     * @param message
     */
    public CommonCode(CommonCode responseCode, String message)
    {
        this.code = responseCode.getCode();
        this.message = message;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

}
