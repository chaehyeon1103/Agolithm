package baekjoon.basic;

import java.util.Scanner;

public class Test10872 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= a; i++) {
            num *= i;
        }

        System.out.println(num);
    }
}
