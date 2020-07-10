package org.raisinz.arrays;

public class UnionOpArray {

    void UnionOperation(int[] arr1,int[] arr2,int[] arr3){
        int i=0;
        int k=0;
        int m =arr1.length;
        int n=arr2.length;
        while(i<m){
            arr3[k++]=arr1[i++];
        }

        for (int j = 0; j <n ; j++) {
            boolean found=false;
            for (int l = 0; l < n ; l++) {
                if(arr2[j] == arr3[l]){
                    found=true;
                    break;
                }
            }
            if(!found) arr3[k++]=arr2[j];
        }
    }
    public static void main(String[] args) {
        int[] arr1={3,5,10,4,6};
        int[] arr2={12,4,7,2,5};
        int m=arr1.length;
        int n=arr2.length;
        int[] arr3=new int[m+n];
        UnionOpArray unionOpArray = new UnionOpArray();
        unionOpArray.UnionOperation(arr1,arr2,arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
