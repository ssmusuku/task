package com.training.controller;

import com.training.utility.MathUtility;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @PostMapping("/add/{number1}/{number2}")
    public int addNumbers(@PathVariable int number1, @PathVariable int number2) {
        return MathUtility.add(number1, number2);
    }

}
