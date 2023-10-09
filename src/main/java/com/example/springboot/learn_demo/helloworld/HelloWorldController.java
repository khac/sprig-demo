package com.example.springboot.learn_demo.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
//    @RequestMapping(method = RequestMethod.GET, path="/hello-world")
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {

        return new HelloWorldBean("Hello World!");
    }

    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World! %s", name));
    }
}