package com.stackroute.pe2;

public class Factorial {

    public int checkFactorial(int number) {
        int factorial = 1;
            while (number > 0) {
                try {
                    factorial = Math.multiplyExact(factorial, number);
                } catch (ArithmeticException arithmeticException) {
                    factorial = -1;
                    break;
                }
                number--;
            }
            return factorial;

        /*Returns null but as the method should return a null it is casted as Integer*/
    }

    public long fact(long number) {

        if ((number == 0) || (number == 1)) {
            return 1L;
        } else {
            long factorial = 1;
            while (number > 0) {
                try {
                    factorial = Math.multiplyExact(factorial, number);
                } catch (ArithmeticException arithmeticException) {
                    factorial = -1;
                    break;
                }
                number--;
            }
            return factorial;
        }

        /*Returns null but as the method should return a null it is casted as Long*/
    }

}
