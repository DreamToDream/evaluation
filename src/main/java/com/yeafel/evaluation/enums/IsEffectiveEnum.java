package com.yeafel.evaluation.enums;

import lombok.Getter;

/**
 * Created by thc on 2019/9/13 11:09
 */
@Getter
public enum IsEffectiveEnum implements CodeEnum<Integer>{
    VALID(0,"生效"),
    INVALID(1,"无效的"),
    ;

    private Integer code;

    private String message;

    IsEffectiveEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
