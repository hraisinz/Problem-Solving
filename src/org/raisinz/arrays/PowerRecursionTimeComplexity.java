package org.raisinz.arrays;

public class PowerRecursionTimeComplexity {

    public int getPower(int x,int n){
        if(n == 0) return 1;
        else if(n%2 == 0){
            int y=getPower(x,n/2);
            return y*y;
        }
        else return x*getPower(x,n-1);
    }

    public static void main(String[] args) {
        PowerRecursionTimeComplexity powerRecursionTimeComplexity = new PowerRecursionTimeComplexity();
        System.out.println(powerRecursionTimeComplexity.getPower(2,10));
    }
}
