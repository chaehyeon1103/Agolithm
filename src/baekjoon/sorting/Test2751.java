package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // int a = br.read() -> ASCII CODE로 읽어옴
        // int b = Integer.parseInt(br.readLine()) -> String이기 때문에 int형으로 변형해줘야 함

        int count = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        // 빠르게 정렬
        Collections.sort(arr);

        arr.forEach(i -> sb.append(i).append("\n"));
        System.out.println(sb);
    }
}
