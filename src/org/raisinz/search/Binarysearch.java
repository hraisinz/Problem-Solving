package org.raisinz.search;

public class Binarysearch {

    private final int divValue;

    public Binarysearch(){
        divValue=2;
    }

    public int binarySearch(int[] values,int element){
        int intial=0;
        int last=values.length-1;
        while (intial <= last){
            int middle=(intial+last)/divValue;
            if(values[middle] == element) return middle;
            else if(element < values[middle]) last=middle-1;
            else intial=middle+1;
        }
        return -1;
    }

    public void elementFound(int found){
        if(found == -1) System.out.println("Element Not Found");
        else System.out.println("Element Found at Index : "+found);
    }

    public static void main(String[] args) {
        int[] values={10,20,35,55,62,74};
        int element1=35;
        int element2=32;
        Binarysearch binarysearch = new Binarysearch();
        binarysearch.elementFound(binarysearch.binarySearch(values,element1));
        binarysearch.elementFound(binarysearch.binarySearch(values,element2));
    }
}
