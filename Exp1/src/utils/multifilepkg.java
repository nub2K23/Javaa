package utils;

import java.util.Scanner;

public class multifilepkg {
    public String str1;

    public void readString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str1 = sc.nextLine();
        sc.close();
    }
}