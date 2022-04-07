package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public int iterationCount(List list){
        int c=0,itr=0;

        do{
            c=0;
            List<Integer> l=new ArrayList<>(list);

            for(int i=0;i<l.size()-1;i++){
                if(l.get(i)<l.get(i+1)){
                    c++;
                    list.set(i+1,0);
                }
            }
            if(c>0) {
                itr++;
                list= (List) list.stream().filter(i->!i.equals(0)).collect(Collectors.toList());
            }

        }while(c!=0&&list.size()>1);
        if(itr==1&&list.size()==1)
            return -1;
        else
            return itr;

    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,5,8,4,7,10,9);
        Task1 t=new Task1();
        int i=t.iterationCount(list);
        System.out.println("Result :"+i);
    }}

