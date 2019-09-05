package org.raisinz.sortings;

public class InsertionSort {

    public void insertionSortAlgo(int[] arr){

        for (int i = 1; i <arr.length ; i++) {
            int value=arr[i];
            int t=i;
            while (t>0 && arr[t-1]>value){
                arr[t]=arr[t-1];
                t=t-1;
            }
            arr[t]=value;
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
