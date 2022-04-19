package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        System.out.println("Enter length of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]>=k){
                    System.out.println("pairs ("+i+" "+j+")");
                    c++;
                }
            }
        }
        System.out.println("Pairs count"+c);
    }
}
