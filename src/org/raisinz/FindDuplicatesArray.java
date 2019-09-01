package org.raisinz;

public class FindDuplicatesArray {

    public void findDuplicate(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] values={1,2,3,4,2,6,7,8,7};
        FindDuplicatesArray findDuplicatesArray = new FindDuplicatesArray();
        findDuplicatesArray.findDuplicate(values);
    }
}
