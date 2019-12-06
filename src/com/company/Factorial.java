package com.company;

public class Factorial {

    public static long calcFactorial(int a) {
        long b = 1;
        while (a > 0) {
            b = b * a;
            a--;
        }
        return b;
    }

    public static int calcE(int a){
        int b=1;
        int n=b;
        while(a>0) {
            b = b*a;
            n = 1/b;

    }

        public static void main (String[]args) {
            for (int g = 1; g <= 20; g++) {
                System.out.println(calcFactorial(g));
                System.out.println(                                                                                                                                      calcE();

            }
        }

}
