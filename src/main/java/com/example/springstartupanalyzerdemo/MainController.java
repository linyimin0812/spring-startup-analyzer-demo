package com.example.springstartupanalyzerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yiminlin
 * @date 2023/08/01 23:11
 **/
@RestController
public class MainController {
    @RequestMapping(value = "/actuator/health", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
