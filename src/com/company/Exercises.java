package com.company;

public class  Exercises{

    public static int addOdds(int n){
        int total=0;
        for(int i=1; i<=n; i= i+2 ) {
             total = total+i;
        }
        return total;
    }
    public static int howManyYears(double startPop, double endPop) {
        int a=0;
        while (startPop <= endPop) {
            startPop = startPop + (startPop*.0113);
            a++;
        }
        return a;
    }
    public static int sumDigits(int n) {
        int sum = 0;
        int d;
        while (n > 0) {
            d = n % 10;
            n = n / 10;
            sum = sum + d;
        }
        return sum;
    }
    public static void  sillyNumbers() {
        for (int c = 1; c <= 3; c++) {
            for (int b = 0; b <= 9; b++) {
                int a = 1;
                while (a <= 3) {
                    System.out.print(b);
                    a++;
                }
            }
            System.out.println();
        }
    }
    public static void sillyNumbers2() {
        for (int c = 1; c <= 4; c++) {
            for (int a = 9; a >= 1; a--) {
                for (int b = 1; b <=a; b++) {
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }
    public static void dollarsAndStars() {
        for (int i =1; i <=7; i++) {
            for (int q =0; q<=12; q= q +2) {
                for (int n = 7; n>=1; n--) {
                    for (int p = 14; p>=2; p= p - 2) {
                        System.out.print("")



    }





    public static void main(String[] args) {
        System.out.println(addOdds(7));
        System.out.println(addOdds(5));
        System.out.println(addOdds(13));
        System.out.println(howManyYears(111.2, 150));
        System.out.println(howManyYears(111.2, 120));
        System.out.println(sumDigits(69));
        System.out.println(sumDigits(720));
        System.out.println(sumDigits(4201));
        sillyNumbers();
        sillyNumbers2();
        dollarsAndStars();
    }
}