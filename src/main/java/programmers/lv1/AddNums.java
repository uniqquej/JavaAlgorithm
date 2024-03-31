package programmers.lv1;

public class AddNums {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3}, new boolean[]{false,false,true}));

    }

    public static int solution(int[] absolutes, boolean[] signs){
        int answer = 0;
        for(int i=0; i < absolutes.length; i++){
            answer = (signs[i] ? answer+absolutes[i] : answer-absolutes[i]);
        }

        return answer;
    }
}
