package org.raisinz.arrays;

public class FindSmallestElement {

    public int getSmallestElement(int[] arr){
        int size=arr.length;
        int temp;
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[0];
    }

    public int getSecondSmallestElement(int[] arr){
        int size=arr.length;
        int temp;
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[1];
    }


    public static void main(String[] args) {
        int[] values={10,2,85,55,6,80,20};
        FindSmallestElement findSmallestElement = new FindSmallestElement();
        System.out.println(findSmallestElement.getSmallestElement(values));
        System.out.println(findSmallestElement.getSecondSmallestElement(values));
    }
}
