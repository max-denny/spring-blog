package com.blog.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @GetMapping("/add/{number1}/and/{number2}")
    @ResponseBody
    public String addNum(@PathVariable int number1, @PathVariable int number2) {
        return number1 + "plus" + number2 + "equals" + (number1 + number2);

    }

    @GetMapping("/subtract/{number2}/from/{number1}")
    @ResponseBody
    public String subNum(@PathVariable int number1, @PathVariable int number2) {
        return number1 + "minus" + number2 + " equals" + (number1 - number2);
    }

    @GetMapping("/multiply/{number1}/and/{number2}")
    @ResponseBody
    public String multiNum(@PathVariable int number1, @PathVariable int number2) {
        return number1 + " times " + number2 + " equals " + (number1 * number2);
    }

    @GetMapping("/divide/{number1}/by/{number2}")
    @ResponseBody
    public String divNum(@PathVariable int number1, @PathVariable int number2) {
        return number1 + " divided by " + number2 + " equals " + (number1/number2);
    }

    }
