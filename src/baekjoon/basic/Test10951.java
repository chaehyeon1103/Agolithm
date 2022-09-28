package baekjoon.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10951 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            nums.add(a+b);
        }

        nums.forEach(i -> System.out.println(i));
    }
}
