package com.training.controller;

import com.training.utility.MathUtility;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @PostMapping("/add")
    public int addNumbers(@RequestBody MathRequest mathRequest) {
        return MathUtility.add(mathRequest.getNumber1(), mathRequest.getNumber2());
    }
    public static class MathRequest {
        private int number1;
        private int number2;

        public int getNumber1() {
            return number1;
        }

        public void setNumber1(int number1) {
            this.number1 = number1;
        }

        public int getNumber2() {
            return number2;
        }

        public void setNumber2(int number2) {
            this.number2 = number2;
        }
    }

}
