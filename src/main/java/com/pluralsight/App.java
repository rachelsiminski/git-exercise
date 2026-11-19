package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        System.out.println("Goodbye " + name + "!");

        // The fix was able to go live because the unfinished goodbye message
        // was stored in the AddGoodbye branch, not in main. This means that
        // when FixPrompt was merged with main the fix appeared, but the
        // goodbye message was still isolated from the rest fo the code
    }
}
