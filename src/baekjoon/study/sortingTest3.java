package baekjoon.study;

import java.util.Arrays;
import java.util.Collections;

public class sortingTest3 {

    public int solution(int[] citations) {
        int N=citations.length;
        Integer []temp=new Integer[N];
        for (int i = 0; i < N; i++) {
            temp[i]=citations[i];
        }
        int answer=0;
        Arrays.sort(temp, Collections.reverseOrder());

        while(answer<N){
            if(temp[answer]<=answer)break;	//temp[answer]값이 answer보다 작거나 같아지면 끝이난다.
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
