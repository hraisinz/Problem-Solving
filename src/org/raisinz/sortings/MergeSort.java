package org.raisinz.sortings;

public class MergeSort {

    private int[] crr;

    public void MergeArray(int[] arr,int[] brr){
        int i=0;
        int j=0;
        int k=0;
        int m=arr.length;
        int n=brr.length;
        crr =new int[m+n];
        while (i < m && j < n){
            if(arr[i] < brr[j]) crr[k++]=arr[i++];
            else crr[k++]=brr[j++];
        }
        for (; i < m; i++) {
            crr[k++]=arr[i];
        }
        for (; j < n; j++) {
            crr[k++]=brr[j];
        }
    }

    public void getElements(){
        for (int i = 0; i < crr.length ; i++) {
            System.out.println(crr[i]);
        }
    }

    public static void main(String[] args){
        int[] a={2,8,15,18};
        int[] b={5,9,12,17};
        MergeSort mergeSort = new MergeSort();
        mergeSort.MergeArray(a,b);
        mergeSort.getElements();
    }
}
