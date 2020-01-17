package com.yeafel.evaluation.enums;

import lombok.Getter;

/**
 * Created by thc on 2019/9/13 11:39
 */
@Getter
public enum ChannelStateEnum implements CodeEnum<Integer>{
    NO_START(0,"未开始"),
    START(1,"开始评教"),
    SUSPEND(2,"暂停评教"),
    STOP(3,"停止评教"),
    ;

    private Integer code;

    private String message;

    ChannelStateEnum(Integer code, String message) {
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
