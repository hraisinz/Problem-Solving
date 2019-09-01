package org.raisinz;

public class SelectionSort {

    public void selectionSortAlgo(int[]  arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            int index=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }

    public void getElements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        int[] values={8,15,35,6,57,2,5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSortAlgo(values);
        selectionSort.getElements(values);
    }
}
