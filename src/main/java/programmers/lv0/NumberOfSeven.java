package programmers.lv0;

public class NumberOfSeven {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 29}));

    }

    public static int solution(int[] array){
        int answer = 0;
        for(int i: array){
            String[] strArr = (i+"").split("");
            for(String s : strArr){
                if(s.equals("7")) answer++;
            }
        }
        return answer;
    }
}
