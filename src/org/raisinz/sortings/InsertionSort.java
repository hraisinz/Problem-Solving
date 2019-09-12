package org.raisinz.sortings;

public class InsertionSort {

    public void insertionSortAlgo(int[] arr){

        for (int i = 1; i <arr.length ; i++) {
            int value=arr[i];
            int hole=i;
            while (hole>0 && arr[hole-1]>value){
                arr[hole]=arr[hole-1];
                hole=hole-1;
            }
            arr[hole]=value;
        }
    }
    public void getElements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        int[] values={20,45,5,30,10,55,12,1};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSortAlgo(values);
        insertionSort.getElements(values);
    }
}
