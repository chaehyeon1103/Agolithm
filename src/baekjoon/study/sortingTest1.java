package baekjoon.study;

import java.util.Arrays;

public class sortingTest1 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {

            int start = commands[i][0];
            int end = commands[i][1];
            int select = commands[i][2];
            int[] array2 = new int[end - start + 1];

            int index = 0;
            for(int j = start-1; j<end; j++) {
                array2[index] = array[j];
                index++;
            }

            Arrays.sort(array2);
            answer[i] = array2[select-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] arr = solution(array, commands);

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
