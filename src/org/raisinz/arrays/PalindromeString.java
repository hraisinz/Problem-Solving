package org.raisinz.arrays;

public class PalindromeString {


    public void checkPalindromeString(String str){
        boolean res=true;
        int length=str.length();
        for (int i = 0; i < length/2; i++) {
            if(str.charAt(i) != str.charAt(length-i-1)){
                res=false;
                break;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        PalindromeString palindromeString = new PalindromeString();
        palindromeString.checkPalindromeString("abcba");

    }
}
