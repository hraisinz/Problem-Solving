package org.raisinz.arrays;

public class RotatingArray {


    public void leftRotation(int[] values ,int rotation){

        int size=values.length-1;
        int temp;
        for (int i = 0; i <rotation; i++) {
            temp=values[0];
            for (int j = 0; j < size; j++) {
                values[j]=values[j+1];
            }
            values[size]=temp;
        }
    }

    public void getLeftRotatedArray(int[] values){

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        int rotation=3;
        RotatingArray rotatingArray = new RotatingArray();
        rotatingArray.leftRotation(arr,rotation);
        rotatingArray.getLeftRotatedArray(arr);
     }
}
