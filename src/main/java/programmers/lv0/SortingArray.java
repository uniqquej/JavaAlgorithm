package programmers.lv0;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));

    }

    public static String solution(String myString){
        //String을 한번에 만들 수 있음..
        //char[] c = my_string.toLowerCase().toCharArray();

        String[] strArr = myString.split("");
        int idx = 0;
        for(String s: strArr){
            strArr[idx] = s.toLowerCase();
            idx++;
        }
        Arrays.sort(strArr);
        return String.join("", strArr);
    }

}
