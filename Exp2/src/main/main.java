package main;

import protection.*;

public interface main {
    public static void main(String[] args) {
        propkg2 p2 = new propkg2();
        propkg p1 = new propkg();
        p1.readString();
        p2.readStringextends();
        System.out.println("Public String accessible outside package: " + p1.str1);
        System.out.println("Private String is not accessible outside package.");
        System.out.println("Protected String is not accessible outside package.");
    }
}