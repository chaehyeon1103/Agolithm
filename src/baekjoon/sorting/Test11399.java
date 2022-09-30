package baekjoon.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test11399 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Integer> testData = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            testData.add(sc.nextInt());
        }

        Collections.sort(testData);

        int sum = 0;
        for (int i = 0; i < testData.size(); i++) {
            sum += testData.get(i) * count--;
        }

        System.out.println(sum);
    }
}
