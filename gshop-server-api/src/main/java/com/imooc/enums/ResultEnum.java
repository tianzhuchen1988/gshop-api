package com.imooc.enums;

public enum ResultEnum {

    SUCCESS(0, "成功"),
    PARAM_ERROR(1, "参数不正确"),
    SERVER_ERROR(2, "服务器内部异常"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
