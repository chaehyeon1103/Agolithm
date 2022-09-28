package baekjoon.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10950 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            nums.add(b+c);
        }

        nums.forEach(i -> System.out.println(i));
    }
}
