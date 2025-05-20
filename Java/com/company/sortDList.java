package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class sortDList {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        LinkedList <Integer> list = new LinkedList<>();
        int n = inp.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(inp.nextInt());
        }
        Collections.sort(list);
        for(int num : list)
        {
            System.out.print(num + " ");
        }
    }
}
