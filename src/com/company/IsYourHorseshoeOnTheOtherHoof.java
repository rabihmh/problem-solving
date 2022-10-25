package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> colors = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            int n=in.nextInt();
            colors.put(n, i);
        }
        System.out.println(4 - colors.size());
    }
}
