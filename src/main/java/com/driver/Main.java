package com.driver;

public class Main {
    public static void main(String args[])
    {
        RWOnly r=new RWOnly();
        String newName="Sachin";
        String s=r.setName(newName);
        System.out.println(s);
    }
  
}