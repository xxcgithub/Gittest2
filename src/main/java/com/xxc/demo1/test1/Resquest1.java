package com.xxc.demo1.test1;

import com.xxc.demo1.util.ReturnUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Resquest1 {
    @GetMapping("/aa")
    public ReturnUtil get (String s){
        return ReturnUtil.ok(s);
    }

    @GetMapping("/a")
    public ReturnUtil get1 (Integer i){
        return ReturnUtil.ok1(i);
    }
}
