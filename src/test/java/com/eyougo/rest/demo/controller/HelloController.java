package com.eyougo.rest.demo.controller;

import com.eyougo.rest.spring.version.RequestMinVersion;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * User: mei
 * Date: 3/28/16
 * Time: 22:52
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMinVersion(1)
    @ResponseBody()
    public String get1()  {
        return "Hello V1 World";
    }

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMinVersion(2)
    @ResponseBody
    public String get2()  {
        return "Hello V2 World";
    }


}
