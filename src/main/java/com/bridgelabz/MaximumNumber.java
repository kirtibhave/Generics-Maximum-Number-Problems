package com.bridgelabz;

public class MaximumNumber {
    public <E extends Comparable<E>> E getMaximumNumber(E firstNumber, E secondNumber, E thirdNumber) {
        E maximumNumber = firstNumber;
        if (maximumNumber.compareTo(secondNumber) < 0) {
            maximumNumber= secondNumber;
        }
        if (maximumNumber.compareTo(thirdNumber) < 0) {
            maximumNumber= thirdNumber;
        }
        return maximumNumber;
    }
}

