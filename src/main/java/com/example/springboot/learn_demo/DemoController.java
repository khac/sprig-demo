//package com.example.springboot.learn_demo;
//
///*
//* /demonstration
//* row: id, name, author
//*
//* */
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Arrays;
//import java.util.List;
//
//@RestController
//public class DemoController {
//    @RequestMapping("/demos")
//    public List<Demonstration> retreiveAllDemos() {
//        return Arrays.asList(
//          new Demonstration(1, "Sample tasting salsa", "Mama Jones"),
//          new Demonstration(2, "Sample tasting provolone", "Peets Cheesary"),
//                new Demonstration(3, "Balloons parade", "Jumbo circle jambo"),
//                new Demonstration(4, "Potato parade", "Patato Potato"),
//                new Demonstration(5, "Ice skating", "Tahoe slopes"),
//                new Demonstration(6, "Bear Dancing", "Montana slopes")
//        );
//    }
//}
