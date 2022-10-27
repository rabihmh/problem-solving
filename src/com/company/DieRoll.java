package com.company;

import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        //get max
        int max = Math.max(n1, n2);
        int counter = 0;
        String[] stats = {"1/1", "5/6", "2/3", "1/2", "1/3", "1/6"};
        System.out.println(stats[max - 1]);
    }
}