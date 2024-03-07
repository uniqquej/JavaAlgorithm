package programmers.lv0;

import javax.print.DocFlavor;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));

    }

    public static String solution(String myString){
        char[] arr = new char[myString.length()];
        int l = myString.length()-1;
        for(char c: myString.toCharArray()){
            arr[l] = c;
            l--;
        }
        return new String(arr);

        /*
        // char로 변환 후 String에 붙이기
        String answer = "";
        for (int i=myString.length(); i>0; i--){
            answer+=myString.charAt(i-1);
        }
        return answer;*/
    }
}
