package com.yunnex.ops.erp.api.facade;

import java.util.List;

import com.yunnex.ops.erp.api.dto.request.TestMenuRequestDto;
import com.yunnex.ops.erp.api.dto.response.TestMenuResponsetDto;

import yunnex.common.core.dto.ApiResult;

public interface TestMenuFacade
{
    List<TestMenuResponsetDto> queryAll(TestMenuRequestDto testMenuDto);
    
    List<TestMenuResponsetDto> queryByParams(TestMenuRequestDto testMenuDto);

    ApiResult<String> saveMunu(TestMenuRequestDto testMenuDto);

    ApiResult<String> updateMunu(TestMenuRequestDto testMenuDto);
    
    boolean isMenuExists (String name);
}
