package com.imooc.ad.advice;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zb
 * @date 2022年11月30日 17:05
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest httpServletRequest,
                                                     AdException adException) {
        CommonResponse<String> response = new CommonResponse<>(-1, "business error");
        response.setData(adException.getMessage());
        return response;
    }
}
