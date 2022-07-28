package com.ironhack.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        double taskEarning = 0.7;
        double taskFee = 0.1;

        int averageTaskByDayAndClient = 400;
        int averageClientsByDay = 20000;

        System.out.println((taskEarning + taskFee) * averageTaskByDayAndClient * averageClientsByDay * 365);

        BigDecimal num1 = BigDecimal.valueOf(0.34);
        BigDecimal num2 = BigDecimal.valueOf(1.2);

        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.divide(num2, RoundingMode.HALF_UP));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.remainder(num2));

        // BigDecimal x = BigDecimal.valueOf(1.61);

        System.out.println(calculate(BigDecimal.valueOf(3.5)));

    }
    public static BigDecimal calculate (BigDecimal x){
        return (BigDecimal.valueOf(2.3).multiply(x)).add(BigDecimal.valueOf(1.5)).divide(x.subtract(BigDecimal.valueOf(0.8)),RoundingMode.HALF_UP);
    }
}
