package com.yunnex.ops.erp.api.dto.request;

import yunnex.common.core.dto.BaseDto;

public class TestMenuRequestDto extends BaseDto
{
    private static final long serialVersionUID = 9546745674503L;
    private String id;
    private String name;
    private String icon;
    private String path;
    private Long sort;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getIcon()
    {
        return icon;
    }

    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public Long getSort()
    {
        return sort;
    }

    public void setSort(Long sort)
    {
        this.sort = sort;
    }
}
