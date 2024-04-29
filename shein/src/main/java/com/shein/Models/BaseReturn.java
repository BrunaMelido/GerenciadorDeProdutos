package com.shein.Models;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BaseReturn {

    private String _message;
    private boolean _worked;

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
}
