package org.raisinz.search;

public class RecursiveBinarysearch {

    public int binarySearch(int[] values,int intial,int last,int element){

        int middle=(intial+last)/2;
        if(intial>last) return -1;
        if(element == values[middle]) return middle;
        else if(element < values[middle]) return binarySearch(values,intial,middle-1,element);
        else return binarySearch(values,middle+1,last,element);
    }

    public void elementFound(int found){
        if(found == -1) System.out.println("Element Not Found");
        else System.out.println("Element Found at Index :"+found);
    }

    public static void main(String[] args) {
        int values[] = {10,20,30,40,50,60};
        int key = 50;
        int intial=0;
        int last=values.length-1;
        RecursiveBinarysearch recursiveBinarysearch = new RecursiveBinarysearch();
        recursiveBinarysearch.elementFound(recursiveBinarysearch.binarySearch(values, intial, last, key));

    }
}
