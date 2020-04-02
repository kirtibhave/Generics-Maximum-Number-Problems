package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber;

    @Before
    public  void initializedMethod(){
        maximumNumber=new MaximumNumber();
    }

    //1.1
    @Test
    public void givenMaximumIntegerNumber_WhenAtFirstPosition_ShouldReturnSameNumber(){
        Assert.assertSame(86,maximumNumber.getMaximumNumberInteger(86,34,20));
    }

    //1.2
    @Test
    public void givenMaximumIntegerNumber_WhenAtSecondPosition_ShouldReturnSameNumber(){
        Assert.assertSame(86,maximumNumber.getMaximumNumberInteger(34,86,20));
    }

    //1.3
    @Test
    public void givenMaximumIntegerNumber_WhenAtThirdPosition_ShouldReturnSameNumber(){
        Assert.assertSame(86,maximumNumber.getMaximumNumberInteger(34,20,86));
    }

    //2.1
    @Test
    public void givenMaximumFloatNumber_WhenAtFirstPosition_ShouldReturnSameNumber(){
        Float result=maximumNumber.getMaximumFloatNumber(8.8f,3.97f,5.94f);
        Assert.assertEquals(Float.valueOf(8.8f),result);
    }

    //2.2
    @Test
    public void givenMaximumFloatNumber_WhenAtSecondPosition_ShouldReturnSameNumber(){
        Float result=maximumNumber.getMaximumFloatNumber(3.97f,8.8f,5.94f);
        Assert.assertEquals(Float.valueOf(8.8f),result);
    }
}

