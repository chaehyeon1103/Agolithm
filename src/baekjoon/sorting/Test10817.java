package baekjoon.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test10817 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(sc.nextInt());
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2-i; j++) {
                if(arr.get(j) > arr.get(j+1)) Collections.swap(arr, j, j+1);
            }
        }

        System.out.println(arr.get(1));
    }
}
