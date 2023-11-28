package com.ywy.interceptor;

import com.ywy.controller.result.R;
import com.ywy.controller.result.ResultStatus;
import com.ywy.exception.BusinessException;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionInterceptor {

    /**
     * 业务异常拦截
     * @param ex
     * @return R
     */
    @ExceptionHandler({BusinessException.class})
    @ResponseBody
    public R<Object> businessExceptionHandler(BusinessException ex) {
        return new R<>(null, ResultStatus.FAIL.ordinal(), ex.getCode(), ex.getMessage());
    }

    /**
     * mybatis多条记录异常拦截
     * @param ex
     * @return R
     */
    @ExceptionHandler({TooManyResultsException.class})
    @ResponseBody
    public R<Object> businessExceptionHandler(TooManyResultsException ex) {
        return new R<>(null, ResultStatus.FAIL.ordinal(), 808, "预期查出一条记录, 但实际查出了多条:" + ex.getMessage());
    }
}
