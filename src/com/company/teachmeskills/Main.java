package com.company.teachmeskills;


import java.util.Scanner;

public class Main {

    static String name;

    public static void main(String[] args) {
        //Task1

        System.out.println("Hello World");


        //Task 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя");
        name = scanner.nextLine();
        System.out.println("имя " + name);


        //Task3

        for (int i = 0; i < args.length; i++) {
            System.out.println("Hello " + args[0]);
        }
    }
}