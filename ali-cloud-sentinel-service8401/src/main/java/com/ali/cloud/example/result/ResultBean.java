package com.ali.cloud.example.result;

public class ResultBean {
//    private String code;
//    private String state;
    private String message;

    public String ResultBean(String message){
//        return "result:"+state+"||"+"responseCode:"+code+"||"+"repsoneMessage:"+message;
        return message;
    }
}
