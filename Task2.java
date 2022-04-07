package com.company;

import java.util.HashMap;
import java.util.Stack;

public class Task2 {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        s=s.trim();
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
            {
                st.push(s.charAt(i));
                continue;
            }
            if(st.size()== 0 || map.get(s.charAt(i))!=st.pop())
                return false;
        }
        if(st.size()==0)
            return true;

        return false;
    }
    public static void main(String[] args){
        Task2 t=new Task2();
        System.out.println(t.isValid("{}]"));
    }
}
