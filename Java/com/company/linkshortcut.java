package com.company;
import java.util.LinkedList;
import java.util.Scanner;
public class linkshortcut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"->");
        }
        System.out.println("NULL");
        int cycle = sc.nextInt();
        if(cycle<n)
        {
            System.out.println("cycle detected");
        }
        else{
            System.out.println("no cycle detected");
        }
    }
}

