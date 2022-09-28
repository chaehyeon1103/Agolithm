package baekjoon.basic;

import java.util.Scanner;

public class Test2438 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            String star = "*";

            for (int j = 0; j < i; j++) {
                star += "*";
            }

            System.out.println(star);
        }
    }
}
