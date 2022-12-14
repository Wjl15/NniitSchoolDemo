package com.wei.onlinemall.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @Author WeiJinLong
 * @Date 2022-09-22 14:54
 */

@RestControllerAdvice()
public class ResponseAdvice implements ResponseBodyAdvice {

    private ObjectMapper objectMapper;
    public ResponseAdvice(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {

        if(body instanceof String){	// 如果Controller直接返回String的话，SpringBoot是直接返回，故我们需要手动转换成json。
            return objectMapper.writeValueAsString(Result.success(body));
        }
        if(body instanceof Result){	// 如果返回的结果是ResultData对象，直接返回即可。
            return body;
        }
        return Result.success(body);
    }
}
