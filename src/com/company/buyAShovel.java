package com.company;

import java.util.Scanner;

public class buyAShovel {
    public static void main(String[] args) {
        /*
         * 11   3
         * 1 => 11
         * 2=> 22(2*10=20)
         * 3=> 33(3*10=30)//30 +3
         * */
        Scanner in = new Scanner(System.in);
        int price = in.nextInt();
        int coin = in.nextInt();
        int counter = 0;
        int result = 0;
        while (true) {
            counter++;
            result = price * counter;
            if (result % 10 == 0 || result % 10 == coin)
                break;
        }

        System.out.println(counter);
    }

}

