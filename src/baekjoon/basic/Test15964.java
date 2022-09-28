package baekjoon.basic;

import java.util.Scanner;

public class Test15964 {

    public static Long test(Long a, Long b) {
        return (a+b) * (a-b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long a = sc.nextLong();
        Long b = sc.nextLong();

        System.out.println(test(a, b));
    }
}
