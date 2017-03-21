package com.eyougo.rest.demo.controller;

import com.eyougo.rest.spring.version.RequestMinVersion;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mei on 21/03/2017.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public String get()  {
        return "Hello V1 Test";
    }

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMinVersion(2)
    @ResponseBody
    public String get2()  {
        return "Hello V2 Test";
    }


}
