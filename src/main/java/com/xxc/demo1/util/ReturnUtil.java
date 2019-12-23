package com.xxc.demo1.util;

public class ReturnUtil {

    private String string = "sucess";
    private Integer integer = 200;

    ReturnUtil (Integer integer, String string){
        this.integer = integer;
        this.string = string;
    }
    /*ReturnUtil (Integer integer){
        this.integer = integer;
    }
    ReturnUtil (String string){
        this.string = string;
    }*/

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public static ReturnUtil ok1 (Integer integer){
        return new ReturnUtil(integer,null);
    }
    public static ReturnUtil ok (String s){
        return new ReturnUtil(0, s);
    }

}
