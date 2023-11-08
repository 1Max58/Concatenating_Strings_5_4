package com.example.concatenatingstrings;

import java.util.Scanner;

public class ConcatenatingStrings {
    public static void main(String[] args) {
        System.out.println("This program concatenates two strings.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two strings.");
        System.out.print("First string: ");
        String first = input.next();
        System.out.print("Second string: ");
        String second = input.next();
        String firstAddedToSecond = second.concat(first);
        String secondAddedToFirst = first.concat(second);
        System.out.print("The first one added to the second: " + firstAddedToSecond);
        System.out.println();
        System.out.print("The second one added to the first: " + secondAddedToFirst);
    }
}
