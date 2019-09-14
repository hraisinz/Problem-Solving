package org.raisinz.arrays;

public class Recursion {

    public int getFactorial(int num){
        if(num == 0) return 1;
        return (num * getFactorial(num-1));
    }

    public static void main(String[] args) {

        Recursion recursion = new Recursion();
        System.out.println(recursion.getFactorial(6));
    }
}
