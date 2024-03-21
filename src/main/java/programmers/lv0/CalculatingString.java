package programmers.lv0;

public class CalculatingString {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));

    }

    public static int solution(String myString){
        String[] strArr = myString.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        for(int i = 1; i<strArr.length;i+=2){
            if(strArr[i].equals("+")) answer += Integer.parseInt(strArr[i+1]);
            else if(strArr[i].equals("-")) answer -= Integer.parseInt(strArr[i+1]);
        }
        return answer;

    }
}
