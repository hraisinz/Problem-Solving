package org.raisinz.arrays;

public class Countoccurrence {

    private final int divValue;
    private final int elementValue;

    public Countoccurrence(){
        divValue=2;
        elementValue=0;
    }

    public int binarySearch(int[] values,int element,boolean search){
        int intial=0;
        int last=values.length-1;
        int res= -1;
        while (intial <= last){
            int middle=(intial+last)/divValue;
            if(values[middle] == element) {
                res=middle;
                if(search) last=middle-1;
                else intial=middle+1;
            }
            else if(element < values[middle]) last=middle-1;
            else intial=middle+1;
        }
        return res;
    }

    public void countOccurenceOfElements(int[] values,int element){

        int intialIndex = binarySearch(values, element, true);
        if(intialIndex == -1) System.out.println("Count of "+element+" is : "+elementValue);
        else{
            int lastIndex = binarySearch(values, element, false);
            System.out.println("count of "+element+" is : "+(lastIndex-intialIndex+1));
        }
    }

    public static void main(String[] args) {

        int []sortedArr={10,10,20,20,30,30,30,30,40,50,50};
        Countoccurrence countoccurrence = new Countoccurrence();
        int element= 10;
        countoccurrence.countOccurenceOfElements(sortedArr,element);
    }
}
