package org.raisinz.arrays;

public class SegregateElement {


    public void segregateValue(int[]  arr){
        int size=arr.length-1;
        int left=0;
        int right=size;
        while(left < right){
            while (arr[left] == 0 && left<right) left++;
            while (arr[right] == 1 && left<right) right--;
            if(left < right)
            {
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }
        }
    }

    public void getElement(int[] values){
        for (int i = 0; i <values.length ; i++) {
            System.out.println(values[i]);
        }
    }

    public static void main(String[] args) {
        int array[] = { 0, 1, 0, 1, 1, 0 };
        SegregateElement segregateElement = new SegregateElement();
        segregateElement.segregateValue(array);
        segregateElement.getElement(array);
    }
}
