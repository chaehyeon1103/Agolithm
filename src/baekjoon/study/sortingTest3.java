package baekjoon.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class sortingTest3 {

    public static int solution(int[] citations) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int count : citations) list.add(count);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int idx = 0;
        while (idx < list.size()) {
            if (list.get(idx) <= idx) break;
            idx++;
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
}
