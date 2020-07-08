package org.raisinz.arrays;

public class MergingSortedArray {


    void mergeArray(int[] arr1,int[] arr2,int[] arr3){

        int i=0;
        int j=0;
        int k=0;
        int m =arr1.length;
        int n=arr2.length;
        while (i<m && j<n){
            if(arr1[i]<arr2[j]) arr3[k++]=arr1[i++];
            else arr3[k++]=arr2[j++];
        }
        for (; i <m ; i++) arr3[k++]=arr1[i];
        for (; j <n ; j++) arr3[k++]=arr2[j];
    }

    public static void main(String[] args) {

        int[] arr1={3,8,16,20,26};
        int[] arr2={4,10,12,22,24};
        int m=arr1.length;
        int n=arr2.length;
        int[] arr3=new int[m+n];
        MergingSortedArray mergingSortedArray = new MergingSortedArray();
        mergingSortedArray.mergeArray(arr1,arr2,arr3);
        for (int i = 0; i <arr3.length ; i++) {
            System.out.println(arr3[i]);
        }
    }
}
