package baekjoon.basic;

import java.util.Scanner;

public class Test10809 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        int[] arr = new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i] = -1;
        }

        String[] s = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for(int i = 0;i<s.length;i++){
            if(str.contains(s[i])){
                for(int j=0;j<str.length();j++){
                    String sss = String.valueOf(str.charAt(j));
                    if(s[i].equals(sss) && arr[i] == -1){
                        arr[i] = j;
                    }
                }
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}
