package org.raisinz.arrays;

public class IntersectionOpSortedArray {

    void intersectionOpArray(int[] arr1,int[] arr2,int[] arr3){
        int i=0;
        int j=0;
        int k=0;
        int m =arr1.length;
        int n=arr2.length;
        while (i<m && j<n){
            if(arr1[i]<arr2[j]) i++;
            else if(arr2[j]<arr1[i]) j++;
            else{
                arr3[k++]=arr1[i++];
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={2,6,10,15,25};
        int[] arr2={3,6,7,15,20};
        int m=arr1.length;
        int n=arr2.length;
        int[] arr3=new int[m+n];
        IntersectionOpSortedArray intersectionOpSortedArray = new IntersectionOpSortedArray();
        intersectionOpSortedArray.intersectionOpArray(arr1,arr2,arr3);
        for (int i = 0; i <arr3.length ; i++) {
            System.out.println(arr3[i]);
        }
    }
}
