package baekjoon.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();

            arr.add(num);
        }

        int n = sc.nextInt();

        int result = 0;
        for(int i : arr) {
            if(n == i) result++;
        }

        System.out.println(result);
    }
}
