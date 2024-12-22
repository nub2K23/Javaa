// WAP in JAVA to create your own exception types to handle situation specific to your application.
// (Hint: Define a subclass of Exception which itself is a subclass of Throwable).

// 15

import java.util.Scanner;

public class OwnExcep extends Exception {
    public OwnExcep(String s) {
        super(s);
    }
}

class Demo2 {
    static void find(int arr[], int item) throws OwnExcep {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i])
                flag = true;
        }
        
        if (flag == false)
            throw new OwnExcep("Item not found");
        else
            System.out.println("Item found");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number to find: ");
        int a = sc.nextInt();
        sc.close();
        try { 
            find(new int[] {12, 25, 25, 67, 34, 45, 6, 7, 98, 23}, a);
        } catch (OwnExcep i) {
            System.out.println(i);
        }
    }
}