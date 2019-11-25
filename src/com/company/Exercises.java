package com.company;

public class  Exercises{

    public static int addOdds(int n){
        int total=0;
        for(int i=1; i<=n; i= i+2 ) {
             total = total+i;
        }
        return total;
    }
    public static int howManyYears(double startpop, double endpop) {
        int a=0;
        while (startpop <= endpop) {
            startpop = startpop + (startpop*.0113);
            a++;
        }
        return a;
    }





    public static void main(String[] args) {
        System.out.println(addOdds(7));
        System.out.println(addOdds(5));
        System.out.println(addOdds(13));
        System.out.println(howManyYears(111.2, 150));
        System.out.println(howManyYears(111.2, 120));
    }
}