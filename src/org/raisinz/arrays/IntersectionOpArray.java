package org.raisinz.arrays;

public class IntersectionOpArray {

    void intersectionOperation(int[] arr1,int[] arr2,int[] arr3){
        int k=0;
        int m =arr1.length;
        int n=arr2.length;

        for (int j = 0; j <n ; j++) {
            for (int l = 0; l < n ; l++) {
                if(arr1[j] == arr2[l]){
                    arr3[k++]=arr1[j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={3,5,10,4,6};
        int[] arr2={12,4,7,2,5};
        int m=arr1.length;
        int n=arr2.length;
        int[] arr3=new int[m+n];
        IntersectionOpArray intersectionOpArray = new IntersectionOpArray();
        intersectionOpArray.intersectionOperation(arr1,arr2,arr3);
        for (int i = 0; i <arr3.length ; i++) {
            System.out.println(arr3[i]);
        }
    }
}
