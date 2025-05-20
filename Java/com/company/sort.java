package com.company;
import java.util.LinkedList;
import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        LinkedList<Integer> odd = new LinkedList<>();
        LinkedList <Integer> even = new LinkedList<>();
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i=0;i<n;i++)
        {
            int a = inp.nextInt();
            if(a%2 == 0)
            {
                even.add(a);
            }
            else {
                odd.add(a);
            }
        }
        for(int num: even)
        {
            System.out.print(num + "->");
        }
        for(int num: odd)
        {
            System.out.print(num + "->");
        }
        System.out.println("NULL");
    }
}
