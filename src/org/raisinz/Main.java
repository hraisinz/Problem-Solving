package org.raisinz;

public class Main {

    public static void main(String[] args) {

        int[] sortedArr={10,20,30,30,44,44,55,60,60,70};
        int[] resultArr=new int[10];
        int j=0;
        for (int i = 0; i <sortedArr.length-1 ; i++) {
           if(sortedArr[i] != sortedArr[i+1]){
                resultArr[j]=sortedArr[i];
                j++;
           }
        }
        resultArr[j]=sortedArr[sortedArr.length-1];
        for (int i = 0; i <=j ; i++) {
            System.out.println(resultArr[i]);
        }
    }
}



