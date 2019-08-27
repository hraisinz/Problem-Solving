package org.raisinz;

public class ModularExponentiation {

    public int getMod(int x,int n,int m){

        if(n == 0) return 1;
        else if(n%2 ==  0){
            int y=getMod(x,n/2,m);
            return (y*y) % m;
        }
        else return ((x%m) * getMod(x,n-1,m)) % m;
    }
    public static void main(String[] args) {

        ModularExponentiation modularExponentiation = new ModularExponentiation();
        System.out.println(modularExponentiation.getMod(5,3,7));
    }
}
