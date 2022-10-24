package com.company;
import java.util.Scanner;
public class Games {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = in.nextInt();
            arr2[i] = in.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr1[i] == arr2[j])
                    counter++;
            }
        }
        System.out.println(counter);
    }
}

