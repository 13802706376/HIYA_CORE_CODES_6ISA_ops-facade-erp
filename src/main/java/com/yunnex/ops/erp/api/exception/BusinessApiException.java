package com.yunnex.ops.erp.api.exception;


public class BusinessApiException extends RuntimeException
{
    private static final long serialVersionUID = 32344444963961241L;
    private int code;
    private Object[] args;

    public BusinessApiException()
    {
        super();
    }

    public BusinessApiException(String message)
    {
        super(message);
    }

    public BusinessApiException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public BusinessApiException(int code, String message)
    {
        super(message);
        this.code = code;
    }

    public BusinessApiException(int code, String message, Throwable cause)
    {
        super(message, cause);
        this.code = code;
    }
   
    public BusinessApiException(String message, Object[] args)
    {
        super(message);
        this.args = args;
    }

    public BusinessApiException(String message, Throwable cause, Object[] args)
    {
        super(message, cause);
        this.args = args;
    }

    public BusinessApiException(int code, String message, Object[] args)
    {
        super(message);
        this.code = code;
        this.args = args;
    }

    public BusinessApiException(int code, String message, Throwable cause, Object[] args)
    {
        super(message, cause);
        this.code = code;
        this.args = args;
    }

    public int getCode()
    {
        return code;
    }

    public Object[] getArgs()
    {
        return args;
    }

}
