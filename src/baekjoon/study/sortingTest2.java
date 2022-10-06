package baekjoon.study;

import java.util.Arrays;
import java.util.Comparator;

public class sortingTest2 {

    public static String solution(int[] numbers) {
        int len = numbers.length;
        String[] result = new String[len];

        // 숫자 > String으로 파싱하여 array에 입력
        for(int i = 0; i < len; i++) result[i] = numbers[i] + "";
        System.out.println(result[0]);

        // Lambda 를 이용한 Comparetor 생성 -> 두 매개변수 객체를 비교하는 역할
        // 두개 String(s1,s2) 의 Concat 값이 큰 것부터 오도록 정렬
        // 방법1
        Comparator<String> com = (s1, s2) -> (s2 + s1).compareTo(s1+ s2);
        // 방법2
        Comparator<String> com2 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1+ s2); //내림차순
            }
        };

        // compareTo(숫자 비교)
        // 기준 값과 비교대상이 동일한 경우 -> 0
        // 기준 값이 비교대상보다 작은 경우 -> -1
        // 기준 값이 비교대상보다 큰 경우 -> 1
        // compareTo(문자열 비교)
        // 같은 위치의 문자만 비교해 문자열 길이의 차를 리턴해줌
        // 애초에 다른 문자라면 아스키값을 기준으로 비교처리
        // 기준 값과 비교대상이 동일한 경우 -> 0
        // 기준 값이 비교대상보다 작은 경우 -> -1
        // 기준 값이 비교대상보다 큰 경우 -> 1 (양수라면 자리를 바꿔줌)

        // String Array 정렬
        Arrays.sort(result, com);

        String answer = "";
        for(String s : result)
            answer += s;

        if(answer.charAt(0) == '0') return "0";

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        String result = solution(numbers);
        System.out.println(result);
    }
}
