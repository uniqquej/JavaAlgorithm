package programmers.lv0;

public class HiddenNumberAddition {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));

    }

    public static int solution(String myString){
        int result = 0;
        myString = myString.replaceAll("[a-zA-Z]", "");

        for (int i=0; i<myString.length();i++){
            result += myString.charAt(i)-'0';
        }
        return result;
    }
}
