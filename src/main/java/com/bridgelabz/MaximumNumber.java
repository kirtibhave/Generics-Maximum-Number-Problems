package com.bridgelabz;

public class MaximumNumber <E extends Comparable<E>> {
    E firstNumber;
    E secondNUmber;
    E thirdNumber;

    public MaximumNumber(E firstNumber,E secondNUmber,E thirdNumber){
        this.firstNumber=firstNumber;
        this.secondNUmber=secondNUmber;
        this.thirdNumber=thirdNumber;
        }

        public E testMaximum() {
            E maximumNumber = firstNumber;
            if (maximumNumber.compareTo(secondNUmber) < 0) {
                maximumNumber = secondNUmber;
            }
            if (maximumNumber.compareTo(thirdNumber) < 0) {
                maximumNumber = thirdNumber;
            }
            return maximumNumber;
        }
    }
