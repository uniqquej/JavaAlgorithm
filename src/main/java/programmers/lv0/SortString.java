package programmers.lv0;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("p2o4i8gj2")));

    }

    public static int[] solution(String myString){
        myString = myString.replaceAll("[a-zA-Z]","");

        String[]strArr = myString.split("");
        int[] result = new int[strArr.length];
        int i=0;
        for(String str:strArr){
            result[i] = Integer.parseInt(str);
            i++;
        }
        Arrays.sort(result);

        return result;
    }

    // 배열로 바꿀 필요없이 charAt 사용
    public static int[] solution2(String myString) {

        myString = myString.replaceAll("[a-z]","");

        int[] answer = new int[myString.length()];

        for(int i =0; i<myString.length(); i++){
            answer[i] = myString.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
    }
}
