package com.devch.api.eatgo.ifs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changhwan kim
 * @since 2021/01/04
 */

@RestController
public class WelcomeController {

    @GetMapping("")
    public String helloWorld(){
        return "Hello World!!!";
    }
}
