/**
 * 
 */
package com.imooc.web.controller;

import com.imooc.VO.ResultVO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GshopServiceException;
import com.imooc.util.ResultVOUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(GshopServiceException.class)
	@ResponseBody
	public ResultVO handleGshopServiceException(GshopServiceException ex){
		return ResultVOUtil.error(ex.getCode(), ex.getMessage());
	}

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResultVO handleGlobalException(Exception ex) {
		return ResultVOUtil.error(ResultEnum.SERVER_ERROR);
	}

}
