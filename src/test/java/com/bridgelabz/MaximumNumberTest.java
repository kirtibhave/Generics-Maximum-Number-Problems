package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

    public class MaximumNumberTest {

        @Test
        public void givenMaximumIntegerNumber_WhenAtFirstPosition_ShouldReturnSameNumber(){
            MaximumNumber maximumNumber=new MaximumNumber(60,40,10);
            Integer maximumResult= (Integer) maximumNumber.testMaximum();
            Assert.assertSame(60,maximumResult);
        }

        @Test
        public void givenMaximumIntegerNumber_WhenAtSecondPosition_ShouldReturnSameNumber(){
            MaximumNumber maximumNumber=new MaximumNumber(40,60,10);
            Integer maximumResult= (Integer) maximumNumber.testMaximum();
            Assert.assertSame(60,maximumResult);
        }

        @Test
        public void givenMaximumIntegerNumber_WhenAtThirdPosition_ShouldReturnSameNumber(){
            MaximumNumber maximumNumber=new MaximumNumber(40,10,60);
            Integer maximumResult= (Integer) maximumNumber.testMaximum();
            Assert.assertSame(60,maximumResult);
        }

        @Test
        public void givenMaximumFloatNumber_WhenAtFirstPosition_ShouldReturnSameNumber(){
            MaximumNumber maximumNumber=new MaximumNumber(60.0f,40.0f,10.0f);
            Float maximumResult= (Float) maximumNumber.testMaximum();
            Assert.assertEquals(Float.valueOf(60.0f),maximumResult);
        }

        @Test
        public void givenMaximumFloatNumber_WhenAtSecondPosition_ShouldReturnSameNumber(){
            MaximumNumber maximumNumber=new MaximumNumber(40.0f,60.0f,10.0f);
            Float maximumResult= (Float) maximumNumber.testMaximum();
            Assert.assertEquals(Float.valueOf(60.0f),maximumResult);
        }

        @Test
        public void givenMaximumFloatNumber_WhenAtThirdPosition_ShouldReturnSameNumber(){
            MaximumNumber maximumNumber=new MaximumNumber(60.0f,40.0f,10.0f);
            Float maximumResult= (Float) maximumNumber.testMaximum();
            Assert.assertEquals(Float.valueOf(60.0f),maximumResult);
        }


        @Test
        public void givenMaximumStringNumber_WhenAtFirstPosition_ShouldReturnSameNumber(){
            MaximumNumber maximumNumber=new MaximumNumber("Peach", "Apple","Banana");
            String maximumResult= (String) maximumNumber.testMaximum();
            Assert.assertEquals(String.valueOf("Peach"),maximumResult);
        }

        @Test
        public void givenMaximumStringNumber_WhenAtSecondPosition_ShouldReturnSameNumber(){
            MaximumNumber maximumNumber=new MaximumNumber("Apple", "Peach","Banana");
            String maximumResult= (String) maximumNumber.testMaximum();
            Assert.assertEquals(String.valueOf("Peach"),maximumResult);
        }

        @Test
        public void givenMaximumStringNumber_WhenAtThirdPosition_ShouldReturnSameNumber(){
            MaximumNumber maximumNumber=new MaximumNumber("Apple", "Banana","Peach");
            String maximumResult= (String) maximumNumber.testMaximum();
            Assert.assertEquals(String.valueOf("Peach"),maximumResult);
        }
    }



