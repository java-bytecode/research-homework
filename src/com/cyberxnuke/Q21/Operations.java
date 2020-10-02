package com.cyberxnuke.Q21;

import java.util.regex.Pattern;

public class Operations {
    public final int plus;
    public final int minus;
    public final int divide;
    public final int multiply;
    public final int dummy;

    {
        plus = 0;
        minus = 1;
        divide = 2;
        multiply = 3;
        dummy = 4;
    }

    public Double calculate(double input1, double input2, int operation) throws AssertionError {
        if(operation == plus){
            return input1 + input2;
        } else if(operation == minus){
            return input1 - input2;
        } else if(operation == divide){
            return input1/input2;
        } else if(operation == multiply){
            return input1*input2;
        } else {
            throw new AssertionError("Operation is invalid");
        }
    }

}
