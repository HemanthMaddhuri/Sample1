package com.company;

import java.util.Scanner;
public class palindrome {
    public void palind() {
        int r, sum = 0, temp = 0;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number to check whether it is palindorme or not");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("invalid");
        } else if (n > 0) {
            temp = n;
            while (n != 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            if (temp == sum) {
                System.out.println("Palindrome");
            } else if (temp != sum) {
                System.out.println("not Palindrome");
            }
        }
    }
}


