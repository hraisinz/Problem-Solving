package org.raisinz.sortings;

public class MergeSort {

    private int[] crr;

    public void MergeArray(int[] arr,int[] brr,int m,int n){
        int i=0;
        int j=0;
        int k=0;
        crr =new int[m+n];
        while (i < m && j < n){
            if(arr[i] < brr[j]) crr[k++]= arr[i++];
            else crr[k++]=brr[j++];
        }
        for (; i < m; i++) {
            crr[k++]=arr[i];
        }
        for (; j < n; j++) {
            crr[k++]=brr[j];
        }
    }


    public void mergeElements(int[] arr,int l,int mid,int h){
        int i=l;
        int j=mid;
        int k=l;
        crr =new int[h];
        while (i < mid && j < h){
            if(arr[i] < arr[j]) crr[k++]= arr[i++];
            else crr[k++]=arr[j++];
        }
        for (; i < mid; i++) {
            crr[k++]=arr[i];
        }
        for (; j < h; j++) {
            crr[k++]=arr[j];
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
        int m=a.length;
        int n=b.length;
        MergeSort mergeSort = new MergeSort();
//        mergeSort.MergeArray(a,b,m,n);
//        mergeSort.getElements();

        int[] arr={2,8,15,18,5,9,12,17};
        int low=0;
        int mid=(arr.length/2);
        int high=arr.length;
        mergeSort.mergeElements(arr,low,mid,high);
        mergeSort.getElements();
    }
}
