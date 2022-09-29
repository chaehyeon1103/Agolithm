package baekjoon.basic;

import java.util.Scanner;

public class Test11654 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char s = sc.nextLine().charAt(0); // charAt => string으로 저장된 문자열 중 한 글자만 선택해 char타입으로 변경
        int num = (int)s;

        System.out.println(num);
    }
}
