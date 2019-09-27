package org.raisinz.arrays;

public class NestedRec {

    public int nestedRec(int n){
        if(n > 100) return n-10;
        else return nestedRec(nestedRec(n+11));
    }
    public static void main(String[] args) {

        NestedRec nestedRec = new NestedRec();
        System.out.println(nestedRec.nestedRec(95));
    }

}
