package org.raisinz.arrays;

public class Removeduplicates {

    private int currentIndex;
    private int[] resultArr;

    public void removeDuplicate(int[] sortedArr){
        int size=sortedArr.length-1;
        int current=0;
        for (int i = 0; i <size ; i++) {
            if(sortedArr[i] != sortedArr[i+1]){
                sortedArr[current]=sortedArr[i];
                current++;
            }
        }
        sortedArr[current]=sortedArr[size];
        for (int i = current+1; i <sortedArr.length; i++) {
            sortedArr[i]=0;
        }
        currentIndex=current;
        resultArr=sortedArr;
    }

    public void getArray(){
        for (int i = 0; i <= currentIndex; i++) {
            System.out.println(resultArr[i]);
        }
    }
    public static void main(String[] args) {

        int[] sortedArr={10,20,30,30,44,44,55,60,60,70,70,90};
        Removeduplicates removeduplicates = new Removeduplicates();
        removeduplicates.removeDuplicate(sortedArr);
        removeduplicates.getArray();


    }
}

