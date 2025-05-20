package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class bitonic {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Before sorting");
        for(int num : list){
            System.out.print(num + " ");
        }
        Collections.sort(list);
        System.out.println();
        System.out.println("After Sorting");
        for(int num : list){
            System.out.print(num + " ");
        }
    }
}







