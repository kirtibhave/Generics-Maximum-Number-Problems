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
}
