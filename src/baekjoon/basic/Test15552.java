package baekjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Test15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st; // 문자열을 나눠주는 클래스

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            bw.write((Integer.parseInt(st.nextToken()) + (Integer.parseInt(st.nextToken())) + "\n"));
        }
        bw.close();
    }
}
