package com.yeafel.evaluation.handler;

import com.yeafel.evaluation.vo.ResultVO;
import com.yeafel.evaluation.exception.EvaluationException;
import com.yeafel.evaluation.utils.ResultVOUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  异常处理
 * Created by thc on 2019/9/20 1:27
 */
@ControllerAdvice
public class EvaluationExceptionHandler {

    @ExceptionHandler(value = EvaluationException.class)
    @ResponseBody
    public ResultVO handlerEvaluation(EvaluationException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }
}
