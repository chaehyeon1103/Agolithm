package baekjoon.basic;

import java.util.Scanner;

public class Test9086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sc.nextInt(); i++) {
            String str = sc.nextLine();
            System.out.println(str.valueOf(0) + str.valueOf(str.length()));
        }
    }
}
