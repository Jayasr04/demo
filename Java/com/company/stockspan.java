package com.company;

import java.util.Scanner;

public class stockspan {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int price[] = new int[n];
        int span[] = new int[n];
        for(int i=0;i<n;i++)
        {
            price[i] = inp.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            int count =1;
            for(int j=i-1 ; j>=0 && price[j] <= price[i] ;j--)
            {
                count++;
            }
            span[i] = count;
        }
        for(int num: span)
        {
            System.out.print(num + " ");
        }
    }
}
