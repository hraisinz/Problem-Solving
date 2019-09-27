package org.raisinz.arrays;

public class SumOfNaturalNumber {

    //Using Iterative method
    int getSum(int n){
        int s=0;
        for (int i = 1; i <= n ; i++) {
            s=s+i;
        }
        return s;
    }

    //Using Recursion
    int getSumRecursion(int n){
        if(n == 0) return 0;
        else return getSumRecursion(n-1)+n;
    }

    int getSumMath(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        SumOfNaturalNumber sumOfNaturalNumber = new SumOfNaturalNumber();
        System.out.println(sumOfNaturalNumber.getSum(10));
        System.out.println(sumOfNaturalNumber.getSumRecursion(5));
        System.out.println(sumOfNaturalNumber.getSumMath(5));
    }
}
