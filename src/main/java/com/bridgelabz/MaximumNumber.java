package com.bridgelabz;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber <E extends Comparable<E>> {
    public static <E extends Comparable<E>> E getMaximumNumber(E firstNumber,E secondNumber,E thirdNumber,E...AnyNumberArgument){
        E maximumNumber = firstNumber;
        if (maximumNumber.compareTo(secondNumber) < 0 ){
            maximumNumber = secondNumber;
        }
        if (maximumNumber.compareTo(thirdNumber) < 0){
            maximumNumber = thirdNumber;
        }
        if(AnyNumberArgument.length != 0) {
            Arrays.sort(AnyNumberArgument, Collections.reverseOrder());
            if ( maximumNumber.compareTo(AnyNumberArgument[0])<0){
                maximumNumber= AnyNumberArgument[0];
            }
        }
        printMax(maximumNumber);
        return maximumNumber;
    }
        public static <E extends Comparable<E>> void printMax(E maximumNumber){
        System.out.println("Maximum Value is:" + maximumNumber);
    }
}
