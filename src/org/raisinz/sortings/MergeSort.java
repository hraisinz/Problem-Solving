package org.raisinz.sortings;

public class MergeSort {

    private int[] c;

    public void MergeArray(int[] arr,int[] brr){
        int i=0;
        int j=0;
        int k=0;
        int m=arr.length;
        int n=brr.length;
        c=new int[m+n];
        while (i < m && j < n){
            if(arr[i] < brr[j]) c[k++]=arr[i++];
            else c[k++]=brr[j++];
        }
        for (; i < m; i++) {
            c[k]=arr[i];
            k++;
        }
        for (; j < n; j++) {
            c[k]=brr[j];
            k++;
        }
    }

    public void getElements(){
        for (int l = 0; l <c.length ; l++) {
            System.out.println(c[l]);
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
