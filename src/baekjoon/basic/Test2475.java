package baekjoon.basic;

import java.util.Scanner;

public class Test2475 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int sum = (a*a) + (b*b) + (c*c) + (d*d) + (e*e);
        System.out.println(sum%10);
    }
}