package com.training.MathControllerTest;

import com.training.controller.MathController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MathControllerTest {
    @Test
    public void testAddNumbers() {
        MathController mathController = new MathController();

        int number1 = 2;
        int number2 = 3;

        int result = mathController.addNumbers(number1,number2);

        int expectedSum = 5;

        assertEquals(expectedSum, result);
    }
    @Test
    public void testNotEquals() {
        MathController mathController = new MathController();

        int number1 = 2;
        int number2 = 3;

        int result = mathController.addNumbers(number1,number2);

        int expectedSum = 6;

        assertNotEquals(expectedSum, result);
    }
}
