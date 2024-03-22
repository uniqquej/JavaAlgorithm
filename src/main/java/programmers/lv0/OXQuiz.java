package programmers.lv0;

import java.util.Arrays;

public class OXQuiz {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));

    }
    // 최대한 형 변환을 줄이자
    public static String[] solution(String[] quiz){
        String[] answer = new String[quiz.length];

        for(int i = 0; i<quiz.length;i++){
            int res = 0;
            String[] q = quiz[i].split(" ");
            if(q[1].equals("+")) res = Integer.parseInt(q[0])+Integer.parseInt(q[2]);
            else res = Integer.parseInt(q[0])-Integer.parseInt(q[2]);

            if(res==Integer.parseInt(q[4])) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
    }
}
