package com.yeafel.evaluation.exception;

import com.yeafel.evaluation.enums.ResultEnum;
import lombok.Getter;

/**
 * Created by thc on 2019/9/17 15:21
 */
@Getter
public class EvaluationException extends RuntimeException {

    private Integer code;

    public EvaluationException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }


    public EvaluationException(Integer code,String message){
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
