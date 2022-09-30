package baekjoon.basic;

import java.util.Scanner;

public class Test9086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String str = sc.next();
            System.out.println(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length()-1)));
            // char to string 변환 -> String.. = String.valueOf(char..)
        }
    }
}
