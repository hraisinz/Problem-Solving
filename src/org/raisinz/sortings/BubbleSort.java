package org.raisinz.sortings;

public class BubbleSort {

    public void bubbleSortAlgo(int[] arr){
        int size=arr.length;
        int temp=0;
        boolean flag=true;
        for (int i = 0; i <size ; i++) {
            for (int j = 1; j <(size-i) ; j++) {
                if(arr[j-1] > arr[j]){
//                    temp=arr[j-1];
//                    arr[j-1]=arr[j];
//                    arr[j]=temp;
                    swap(arr,j-1,j);
                    flag=false;
                }
            }
            if(flag == true) {
                System.out.println("Element is already sorted");
                break;
            }
        }
    }

    private void swap(int [] values,int v1,int v2){
        int temp=values[v1];
        values[v1]=values[v2];
        values[v2]=temp;
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
        int[] values1={2,3,10,15,25,56};
        bubbleSort.bubbleSortAlgo(values1);
    }
}
