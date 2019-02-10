package com.imooc.exception;

import com.imooc.enums.ResultEnum;
import lombok.Data;

/**
 * gshop业务异常
 */
@Data
public class GshopServiceException extends RuntimeException{
    private Integer code;

    public GshopServiceException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public GshopServiceException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
