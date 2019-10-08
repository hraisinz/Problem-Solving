package org.raisinz.search;

public class Linearsearch {

    public void searchElement(int[] values,int searchValue){

        boolean found=false;
        for (int i = 0; i < values.length; i++) {
            if(values[i]== searchValue){
                found=true;
                break;
            }
        }
        if(found) System.out.println("Element Found");
        else System.out.println("Element Not Found");
    }

    public static void main(String[] args) {

        int[] values={50,25,75,100,42,64};
        Linearsearch linearsearch = new Linearsearch();
        linearsearch.searchElement(values,100);
    }
}
