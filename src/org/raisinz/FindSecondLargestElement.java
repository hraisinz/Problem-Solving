package org.raisinz;

public class FindSecondLargestElement {

    public int getSecondLarge(int[] arr){

        int size=arr.length;
        int temp;
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[size-2];
    }

    public int getThirdLarge(int[] arr){

        int size=arr.length;
        int temp;
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[size-3];
    }

    public static void main(String[] args) {

        int[] values={10,2,85,55,6,80,20};
        FindSecondLargestElement findSecondLargestElement = new FindSecondLargestElement();
        System.out.println(findSecondLargestElement.getSecondLarge(values));
        System.out.println(findSecondLargestElement.getThirdLarge(values));


    }
}
