package com.shein.Models;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BaseReturn {

    private String _message;
    private boolean _worked;
    private Object _Object;

    public BaseReturn Success(String message){
        return new BaseReturn(
            message,
            true
        );
    }
    public BaseReturn Error(String message){
        return new BaseReturn(
            message,
            false
        );
    }
    public BaseReturn(String _message, boolean _worked) {
        this._message = _message;
        this._worked = _worked;
    }
    public BaseReturn Success(String message, Object object){
        return new BaseReturn(
            message,
            _worked = true,
            _Object = object
        );
    }
    
}
