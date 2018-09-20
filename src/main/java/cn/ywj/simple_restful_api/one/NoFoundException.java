package cn.ywj.simple_restful_api.one;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoFoundException extends RuntimeException{

    public NoFoundException(String msg){
        super(msg);
    }
}
