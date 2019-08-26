package org.raisinz;

public class Fibonacci {

    public void fib(int count){
        int n1=0;
        int n2=1;
        int n3=0;
        System.out.println(n1+"\n"+n2);
        for (int i = 2; i <= count ; ++i) {
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fib(10);
    }
}
