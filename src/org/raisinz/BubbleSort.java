package org.raisinz;

public class BubbleSort {

    public void bubbleSortAlgo(int[] arr){
        int size=arr.length;
        int temp=0;
        for (int i = 0; i <size ; i++) {
            for (int j = 1; j <(size -i) ; j++) {
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public void getElements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] values={2,45,5,3,10,55,12,11};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSortAlgo(values);
        bubbleSort.getElements(values);
    }
}
