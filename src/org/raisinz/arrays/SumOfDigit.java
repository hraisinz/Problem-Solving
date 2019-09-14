package org.raisinz.arrays;

public class SumOfDigit {

    public int getSumOfDigit(int number){
        if(number == 0) return 0;
        return (number%10 + getSumOfDigit(number/10));
    }
    public static void main(String[] args) {
        SumOfDigit sumOfDigit = new SumOfDigit();
        System.out.println("Sum is : "+sumOfDigit.getSumOfDigit(123456));
    }
}
