package main;

import utils.multifilepkg;

public class Main {
    public static void main(String[] args) {
        multifilepkg p1 = new multifilepkg();
        p1.readString();
        System.out.println("You entered: " + p1.str1);
    }    
}