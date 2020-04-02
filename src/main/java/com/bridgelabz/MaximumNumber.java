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
}
