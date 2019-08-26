package org.raisinz;

public class ZigZagArray {

    public void zigZag(int[] values){

        boolean flag=true;
        int temp=0;
        int size=values.length-2;
        for (int i = 0; i <= size; i++) {

            if(flag){
                if(values[i] > values[i+1]) swapElement(values,i,i+1);
            }
            else{
                if(values[i] < values[i+1]) swapElement(values,i,i+1);
            }
            flag = !flag;
        }
    }

    private void swapElement(int[] values,int v1,int v2){
        int temp=values[v1];
        values[v1]=values[v2];
        values[v2]=temp;
    }

    public void getZigZagArray(int[] values){
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    public static void main(String[] args)  {

        int[] arr={3,4,6,2,1,8,9,10};
        ZigZagArray zigZagArray = new ZigZagArray();
        zigZagArray.zigZag(arr);
        zigZagArray.getZigZagArray(arr);
    }
}
