package org.raisinz;

public class SegregatePositiveNagative {

    public void segregateNumbers(int[] values){
        int start=0;
        int last=values.length-1;
        while (start<last){

            while (values[start]<0 && start<last) start++;
            while (values[last]>0 && start<last) last--;
            if(start<last){
                swap(values,start,last);
                start++;
                last--;
            }
            else break;
        }
    }

    private void swap(int[] values,int v1,int v2){
        int temp=values[v1];
        values[v1]=values[v2];
        values[v2]=temp;
    }

    public static void main(String[] args) {

        int[] arr={-1,3,8,-4,5,-6,7,-20,30,50};
        SegregatePositiveNagative segregatePositiveNagative = new SegregatePositiveNagative();
        segregatePositiveNagative.segregateNumbers(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
