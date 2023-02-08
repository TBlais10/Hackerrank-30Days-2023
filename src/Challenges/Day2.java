package Challenges;
//Challenge Link
//https://www.hackerrank.com/challenges/30-operators/problem?isFullScreen=true

public class Day2 {
    public static double cost = 100;
    public static int tip = 15;
    public static int tax = 8;

    public static void main(String[] args) {
        System.out.println(((double) tip / 100) * cost);
        System.out.println(((double) tax / 100) * cost);
    }
    public static void solve(double meal_cost, int tip_percent, int tax_percent){
       double tipAmount = ((double)tip_percent / 100) * meal_cost;
       double taxAmount = ((double) tax_percent / 100) * meal_cost;

       System.out.println(Math.round(tipAmount + taxAmount + meal_cost));
    }
}
