package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; ++i) {
            long next = (a%10 + b%10)%10;
            a = b%10;
            b = next;
        }
        System.out.println(b);
    }
    }

