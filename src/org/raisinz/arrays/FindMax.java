package org.raisinz.arrays;

public class FindMax {

    public void getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >max) max=arr[i];
        }
        System.out.println("Largest Element is : "+max);
    }


    public void getMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest Element is : "+min);
    }
    public static void main(String[] args) {

        int[] values={10,45,114,65,75,5};
        FindMax findMax = new FindMax();
        findMax.getMax(values);
        findMax.getMin(values);
    }
}
