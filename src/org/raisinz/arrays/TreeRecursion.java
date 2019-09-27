package org.raisinz.arrays;

public class TreeRecursion {

    public void treeRec(int n){
        if(n>0){
            System.out.println("Value of n : "+n);
            treeRec(n-1);
            treeRec(n-1);
        }
    }
    public static void main(String[] args) {
        TreeRecursion treeRecursion = new TreeRecursion();
        treeRecursion.treeRec(3);
    }
}
