package com.company;

import java.util.*;
class Coin_change{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int deno[] = new int[n];
        for(int i=0; i<n; i++)
            deno[i]=s.nextInt();
        int amount = s.nextInt();
        int count=0;
        Arrays.sort(deno);
        for(int i = deno.length - 1; i >= 0; i--) {
            while(amount >= deno[i]) {
                count+=1;
                amount -= deno[i];
            }
        }
        if(amount==0)
            System.out.print(count);
        else
            System.out.print(-1);
    }
}
