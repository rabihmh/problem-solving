package com.company;

import java.util.Scanner;

public class ShaassAndOskols {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] numOfBirdsPerWire = new int[n];
        for (int i = 0; i < n; i++) {
            numOfBirdsPerWire[i] = in.nextInt();
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            x--;                     //array is zero based
            int y = in.nextInt();
            if (x != 0) {
                numOfBirdsPerWire[x - 1] += y - 1;
            }
            if (x != numOfBirdsPerWire.length - 1) {
                numOfBirdsPerWire[x + 1] += numOfBirdsPerWire[x] - y;
            }
            numOfBirdsPerWire[x] = 0;
        }
        for (int i = 0; i < numOfBirdsPerWire.length; i++) {
            System.out.println(numOfBirdsPerWire[i]);
        }
    }
}