package org.raisinz.arrays;

public class FibonacciRecursion {

    public int fibRecursion(int n){

        if(n <= 1) return n;
        return fibRecursion(n-1) + fibRecursion(n-2);
    }
    public static void main(String[] args) {

        FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
        System.out.println(fibonacciRecursion.fibRecursion(10));
    }
}
