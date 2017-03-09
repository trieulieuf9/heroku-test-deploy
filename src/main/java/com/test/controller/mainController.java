package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by trieulieuf9 on 3/9/17.
 */

@Controller
public class mainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "hello";
    }

}
