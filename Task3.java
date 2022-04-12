package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter length of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]+1 || a[j]==a[i]+1){
                    System.out.println("pairs ("+i+" "+j+")");
                }
            }
        }
    }
}
