package org.raisinz.arrays;

public class TaylorSeries {

    private double p=1;
    private double f=1;
    double getE(double x,double n){
        double r;
        if(n == 0) return 1;
        r=getE(x,n-1);
        p=p*x;
        f=f*n;
        return r+(p/f);
    }
    public static void main(String[] args) {

        TaylorSeries taylorSeries = new TaylorSeries();
        System.out.println(taylorSeries.getE(1,10));
    }
}
