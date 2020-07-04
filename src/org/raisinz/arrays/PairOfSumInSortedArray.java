package org.raisinz.arrays;

public class PairOfSumInSortedArray {

    public void findPair(int[]  values,int sum){
        int left=0;
        int right=values.length-1;
        while (left<right){
            if((values[left]+values[right]) > sum) right--;
            else if((values[left]+values[right]) < sum) left++;
            else{
                System.out.println("Pair is : "+values[left]+","+values[right]);
                left++;
            }
        }
    }
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int sum=8;
        PairOfSumInSortedArray pairOfSum = new PairOfSumInSortedArray();
        pairOfSum.findPair(arr,sum);
    }
}
