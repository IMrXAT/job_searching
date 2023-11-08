package org.example.job_searching.core;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CalculationService {

    public int getSum(ArrayList<Integer> numsToSum){
        int sum = 0;
        for (int num : numsToSum){
            sum += num;
        }
        return sum;
    }

    public int getMul(ArrayList<Integer> numsToMul){
        int mult = 1;
        for (int num : numsToMul){
            mult *= num;
        }
        return mult;
    }

    public int getMixedOperation(int num1, int num2, int num3){
        return num1 * num2 + num3;
    }

    public int getFactorial(int n){
        int factorial = 1;
        if (n == 0){
            return 1;
        }
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
