package baekjoon.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrSize = sc.nextInt();
        int num = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrSize; i++) {
            int n = sc.nextInt();
            if(n < num) arr.add(n);
        }

        arr.forEach(i -> System.out.print(i + " "));
    }
}
