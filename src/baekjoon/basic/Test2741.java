package baekjoon.basic;

import java.util.Scanner;

public class Test2741 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = 1;

        for (int i = 0; i < a; i++) {
            System.out.println(num);
            num++;
        }
    }
}
