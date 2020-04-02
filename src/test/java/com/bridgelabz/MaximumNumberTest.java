package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber;

    @Before
    public void initializedMethod() {
        maximumNumber = new MaximumNumber();
    }

    @Test
    public void givenMaximumIntegerNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertSame(60, maximumNumber.getMaximumNumber(60, 40, 10));
    }

    @Test
    public void givenMaximumIntegerNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertSame(60, maximumNumber.getMaximumNumber(40, 60, 10));
    }

    @Test
    public void givenMaximumIntegerNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertSame(60, maximumNumber.getMaximumNumber(20, 40, 60));
    }

    @Test
    public void givenMaximumFloatNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Float result = maximumNumber.getMaximumNumber(7.00f, 6.00f, 6.78f);
        Assert.assertEquals(Float.valueOf(7.00f), result);
    }

    @Test
    public void givenMaximumFloatNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Float result = maximumNumber.getMaximumNumber(6.00f, 7.00f, 6.78f);
        Assert.assertEquals(Float.valueOf(7.00f), result);
    }

    @Test
    public void givenMaximumFloatNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Float result = maximumNumber.getMaximumNumber(6.00f, 6.78f, 7.00f);
        Assert.assertEquals(Float.valueOf(7.00f), result);
    }

    @Test
    public void givenMaximumStringNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        String result = maximumNumber.getMaximumNumber("Peach", "Apple", "Banana");
        Assert.assertEquals(String.valueOf("Peach"), result);
    }

    @Test
    public void givenMaximumStringNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        String result = maximumNumber.getMaximumNumber("Apple", "Peach", "Banana");
        Assert.assertEquals(String.valueOf("Peach"), result);
    }

    @Test
    public void givenMaximumStringNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        String result = maximumNumber.getMaximumNumber("Apple", "Banana", "Peach");
        Assert.assertEquals(String.valueOf("Peach"), result);
    }
}