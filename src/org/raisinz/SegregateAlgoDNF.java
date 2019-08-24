package org.raisinz;

public class SegregateAlgoDNF {

    public void segregate(int[] values){
        int start=0;
        int end=values.length-1;
        int middle=0;

        while(middle <= end){
            switch (values[middle]){
                case 0:
                    swap(values, start, middle);
                    start++;
                    middle++;
                    break;
                case 1:
                    middle++;
                    break;
                case 2:
                    swap(values,middle,end);
                    end--;
                    break;
            }
        }
    }

    private void swap(int[] values,int v1,int v2){
        int temp=values[v1];
        values[v1]=values[v2];
        values[v2]=temp;
    }

    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,2,1,2,0,0,0,1};
        SegregateAlgoDNF segregateAlgoDNF = new SegregateAlgoDNF();
        segregateAlgoDNF.segregate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
