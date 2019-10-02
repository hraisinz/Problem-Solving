package org.raisinz.heap;

public class BinaryHeap {

    public void insertHeap(int[] a,int n){

        int temp;
        int i=n;
        temp=a[n];
        while (i > 0 && temp > a[i/2]){

            a[i]=a[i/2];
            i=i/2;
        }
        a[i]=temp;
    }

    public void getHeap(int[] a){

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {

        int [] a={30,20,10,40,50};
        int size=a.length-1;
        BinaryHeap binaryHeap = new BinaryHeap();
        binaryHeap.insertHeap(a,size);
        binaryHeap.getHeap(a);
    }
}
