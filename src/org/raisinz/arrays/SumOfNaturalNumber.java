package org.raisinz.arrays;

public class SumOfNaturalNumber {

    //Using Iterative method
    int getSum(int n){
        int s=0;
        for (int i = 0; i <= n ; i++) {
            s=s+i;
        }
        return s;
    }
    public static void main(String[] args) {
        SumOfNaturalNumber sumOfNaturalNumber = new SumOfNaturalNumber();
        System.out.println(sumOfNaturalNumber.getSum(10));
    }
}
