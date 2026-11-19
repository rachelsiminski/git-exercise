package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        // Why did greeting disappear in step 5?
        // The customized greeting disappears in step 5
        // when you switch back and forth between the branches
        // because main did not have a custom greeting, and
        // the customized greeting branch did.

        System.out.println("Goodbye, " + name + "!");
    }
}
