package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;

    public static void main(String[] args) {

        System.out.println("Program, ktory wyswietli n-ta liczbe ciagu Fibonacciego");

            Scanner wej = new Scanner(System.in);

            System.out.println("Podaj liczbe ciagu.");

            int i1 = wej.nextInt();
            int i2 = 1;
            int i3 = 1;
            int i4;

                if (i1==0)
                {
                    System.out.println("0");
                }
                if (i1==1)
                {
                    System.out.println("1");
                }
                for(int i=2; i<=i1; i++){
                i4 = i2;
                i2 = i3;
                i3 = i3 + i4;
                    System.out.println(i2);
                }
        System.out.println("Koniec programu.");
        }
    }
