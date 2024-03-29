package programmers.lv1;

public class CountPY {
    public static void main(String[] args) {
        System.out.println(solution("PyyY"));

    }

    public static boolean solution(String s){
        int answer = 0;
        s = s.toLowerCase();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='p') answer++;
            else if (s.charAt(i)=='y') answer--;

        }
        return answer == 0;
    }
}
