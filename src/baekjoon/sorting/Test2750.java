package baekjoon.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test2750 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Integer> testData = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            testData.add(sc.nextInt());
        }

        // 버블 정렬
        boolean swap = false;
        for (int i = 0; i < testData.size() - 1; i++) {
            for (int j = 0; j < testData.size() - 1 - i; j++) {
                if(testData.get(j) > testData.get(j+1)) {
                    Collections.swap(testData, j, j+1);
                    swap = true;
                }
            }
            if(swap == false) break;
        }

        testData.forEach(i -> System.out.println(i));
    }
}
