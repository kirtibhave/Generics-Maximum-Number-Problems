package com.bridgelabz;

public class MaximumNumber {
    public Integer getMaximumNumberInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumNumber = firstNumber;
        if (maximumNumber.compareTo(secondNumber) < 0) {
            maximumNumber = secondNumber;
        }
        if (maximumNumber.compareTo(thirdNumber) < 0) {
                maximumNumber = thirdNumber;
            }
            return maximumNumber;
        }

    public Float getMaximumFloatNumber(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maxNumber = firstNumber;
        if (maxNumber.compareTo(secondNumber) < 0) {
            maxNumber = secondNumber;
        }
        if (maxNumber.compareTo(thirdNumber) < 0) {
            maxNumber = thirdNumber;
        }
        return maxNumber;
    }
}
