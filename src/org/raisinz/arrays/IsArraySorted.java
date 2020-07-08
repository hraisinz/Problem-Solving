package org.raisinz.arrays;

public class IsArraySorted {

    boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        int[] arr={10,12,15,16,22,35,28};
        IsArraySorted isArraySorted = new IsArraySorted();
        System.out.println(isArraySorted.isSorted(arr));
    }
}
