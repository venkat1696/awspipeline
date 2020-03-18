package com.dhanu.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/dhanu")
@RestController
public class hellocontroler {
    public String hello() {
       return "hellow dhanu";
    }
}
