package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void givenMaximumIntegerNumber_WhenMoreThanThree_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer maximumResult = (Integer) maximumNumber.getMaximumNumber(60, 40, 20, 10);
        Assert.assertSame(60, maximumResult);
    }

    @Test
    public void givenMaximumIntegerNumber_WhenMoreThanThree_ShouldReturnSecondNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer maximumResult = (Integer) maximumNumber.getMaximumNumber(40, 60, 20, 10);
        Assert.assertSame(60, maximumResult);
    }

    @Test
    public void givenMaximumIntegerNumber_WhenMoreThanThree_ShouldReturnThirdNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer maximumResult = (Integer) maximumNumber.getMaximumNumber(40, 10, 60, 20);
        Assert.assertSame(60, maximumResult);
    }

    @Test
    public void givenMaximumFloatNumber_WhenMoreThanThree_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Float maximumResult = (Float) maximumNumber.getMaximumNumber(60.0f, 20.00f, 40.0f, 10.0f);
        Assert.assertEquals(Float.valueOf(60.0f), maximumResult);
    }

    @Test
    public void givenMaximumFloatNumber_WhenMoreThanThree_ShouldReturnSecondNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Float maximumResult = (Float) maximumNumber.getMaximumNumber(40.0f, 60.0f, 10.0f, 20.0f);
        Assert.assertEquals(Float.valueOf(60.0f), maximumResult);
    }

    @Test
    public void givenMaximumFloatNumber_WhenMoreThanThree_ShouldReturnThirdNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Float maximumResult = (Float) maximumNumber.getMaximumNumber(40.0f, 20.0f, 10.0f, 60.0f);
        Assert.assertEquals(Float.valueOf(60.0f), maximumResult);
    }

    @Test
    public void givenMaximumStringNumber_WhenMoreThanThree_ShouldReturnFirstNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String maxNumber = (String) maximumNumber.getMaximumNumber("Peach", "Banana", "Apple", "Mango");
        Assert.assertEquals("Peach", maxNumber);
    }

    @Test
    public void givenMaximumStringNumber_WhenMoreThanThree_ShouldReturnSecondNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String maxNumber = (String) maximumNumber.getMaximumNumber("Apple", "Peach", "Banana", "Mango");
        Assert.assertEquals("Peach", maxNumber);
    }

    @Test
    public void givenMaximumStringNumber_WhenAtThirdPosition_ShouldReturnThirdNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String maxNumber = (String) maximumNumber.getMaximumNumber("Apple", "Banana", "Peach", "Mango");
        Assert.assertEquals("Peach", maxNumber);
    }
}
