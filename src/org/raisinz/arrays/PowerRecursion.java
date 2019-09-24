package org.raisinz.arrays;

public class PowerRecursion {

    public int getPower(int x,int n){
        if(n != 0) return (x * getPower(x,n-1));
        else return 1;
    }
    public static void main(String[] args) {
        PowerRecursion powerRecursion = new PowerRecursion();
        System.out.println(powerRecursion.getPower(5,3));
    }
}
