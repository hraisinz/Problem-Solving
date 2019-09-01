package org.raisinz;

public class FindMax {

    public void getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >max) {
                max=arr[i];
            }
        }
        System.out.println("Max Value : "+max);
    }
    public static void main(String[] args) {

        int[] values={10,45,114,65,75,10};
        FindMax findMax = new FindMax();
        findMax.getMax(values);
    }
}
