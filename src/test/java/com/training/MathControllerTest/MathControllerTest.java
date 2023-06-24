package com.training.MathControllerTest;

import com.training.controller.MathController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathControllerTest {
    @Test
    public void testAddNumbers() {
        MathController mathController = new MathController();

        // Set up input parameters
        int number1 = 2;
        int number2 = 3;

        // Create a MathRequest object and set the values
        MathController.MathRequest mathRequest = new MathController.MathRequest();
        mathRequest.setNumber1(number1);
        mathRequest.setNumber2(number2);
        int result = mathController.addNumbers(mathRequest);

        // Verify the result
        int expectedSum = 5;
        assertEquals(expectedSum, result);
    }
}
