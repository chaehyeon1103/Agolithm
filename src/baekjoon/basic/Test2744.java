package baekjoon.basic;

import java.util.Scanner;

public class Test2744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            // 65 <= s <= 90 (대문자인 경우)
            if(s >= 65 && s <= 90) result += str.valueOf(s).toLowerCase();
            // 97 <= s <= 122 (소문자인 경우)
            else if(s >= 97 && s <= 122) result += str.valueOf(s).toUpperCase();
        }

        System.out.println(result);
    }
}
