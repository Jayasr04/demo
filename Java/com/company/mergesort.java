package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        Scanner inp  = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(inp.nextInt());
        }
        int m = inp.nextInt();
        for(int i=0;i<m;i++)
        {
            list.add(inp.nextInt());
        }
        Collections.sort(list);
        System.out.println("Merged Linked List");
        for(int num: list)
        {
            System.out.print(num + " ");
        }
    }
}
