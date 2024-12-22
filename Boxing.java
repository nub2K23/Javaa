// Write a program to illustrate Find Sum of Odd Numbers using Autoboxing and Unboxing.
// 2
import java.io.*;
import java.util.*;

class Boxing {
    public static int sumOfOddNumbers(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            if (i % 2 != 0)
                sum += i;
            if (i.intValue() % 2 != 0)
                sum += i.intValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++)
            list.add(i);
        int sumOdd = sumOfOddNumbers(list);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
    }
}