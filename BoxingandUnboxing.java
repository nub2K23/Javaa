//Write a program to demonstrate the concept of boxing and unboxing.
// 1

import java.io.*;
class BoxingandUnboxing {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        int i1 = i;
        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + i1);
        Character gfg = 'a';
        char ch = gfg;
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);
    }
}