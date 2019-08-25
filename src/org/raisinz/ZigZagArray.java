package org.raisinz;

public class ZigZagArray {

    public void zigZag(int[] values){

        boolean flag=true;
        int temp=0;
        int size=values.length-2;
        for (int i = 0; i <= size; i++) {

            if(flag){
                if(values[i] > values[i+1]){
                    temp=values[i];
                    values[i]=values[i+1];
                    values[i+1]=temp;
                }
            }else{
                if(values[i] < values[i+1]){
                    temp=values[i];
                    values[i]=values[i+1];
                    values[i+1]=temp;
                }
            }
            flag = !flag;
        }
    }

    public void getZigZagArray(int[] values){
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr={3,4,6,2,1,8,9,10};
        ZigZagArray zigZagArray = new ZigZagArray();
        zigZagArray.zigZag(arr);
        zigZagArray.getZigZagArray(arr);
    }
}
