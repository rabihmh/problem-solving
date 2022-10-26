package com.company;

import java.util.Scanner;

public class colorfulStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
//        RRRBGBRBBB
//        BBBRR
        int counter = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(counter) == s2.charAt(i)){
                counter++;
            }
        }
        System.out.println(++counter);
    }
}
