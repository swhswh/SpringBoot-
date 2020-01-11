package com.doubles.crea_server.core.common.exception;

import com.doubles.crea_server.core.common.enums.ErrorEnum;
import lombok.Data;

/**
 * MyException
 *
 * @author swh
 * @date 2020-01-11
 * @description 自定义异常
 */
@Data
public class MyException extends RuntimeException{
    private String msg;
    private int code = 500;

    public MyException(){
        super(ErrorEnum.UNKNOWN.getMsg());
        this.msg=ErrorEnum.UNKNOWN.getMsg();
    }


    public MyException(ErrorEnum eEnum,Throwable e){
        super(eEnum.getMsg(),e);
        this.msg=eEnum.getMsg();
        this.code=eEnum.getCode();
    }

    public MyException(ErrorEnum eEnum){
        this.msg=eEnum.getMsg();
        this.code=eEnum.getCode();
    }

    public MyException(String exception){
        this.msg=exception;
    }
}
