package org.raisinz;

public class Binarysearch {

    private final int divValue;

    public Binarysearch(){
        divValue=2;
    }

    public void binarySearch(int[] values,int element){
        int intial=0;
        int last=values.length-1;
        int middle=(intial+last)/divValue;
        while (intial <= last){
            if(values[middle] == element) {
                System.out.println("Element Found at Index : " + middle);
                break;
            }
            else if(element < values[middle]) last=middle-1;
            else intial=middle+1;
            middle=(intial+last)/divValue;
        }
        if(intial > last){
            System.out.println("Element Not Found");
        }
    }

    public static void main(String[] args) {
        int[] values={10,20,35,55,62,74};
        int element1=35;
        int element2=32;
        Binarysearch binarysearch = new Binarysearch();
        binarysearch.binarySearch(values,element1);
        binarysearch.binarySearch(values,element2);
    }
}
