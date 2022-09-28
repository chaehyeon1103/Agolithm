package baekjoon.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10952 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        while (sc.hasNext()) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(b == 0 && c== 0) {
                break;
            }

            nums.add(b+c);
        }

        nums.forEach(i -> System.out.println(i));
    }
}
