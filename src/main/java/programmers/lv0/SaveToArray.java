package programmers.lv0;

import java.util.Arrays;

public class SaveToArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcdef123",3)));

    }
    public static String[] solution(String myString, int n){
        int l = myString.length()%n==0 ?myString.length()/n : myString.length()/n+1;
        String[] answer = new String[l];

        for(int i=0; i<l-1;i++){
            answer[i] = myString.substring(i*n,i*n+n);
        }
        answer[l-1] = myString.substring((l-1)*n);

        return answer;

    }
}
