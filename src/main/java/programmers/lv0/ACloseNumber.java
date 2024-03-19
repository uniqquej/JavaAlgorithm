package programmers.lv0;

public class ACloseNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 11, 12}, 13));

    }

    public static int solution(int[] array, int n){
        int answer = array[0];
        int diff = Math.abs(n-array[0]);

        for(int i = 1; i<array.length; i++){
            int d = Math.abs(n-array[i]);
            if(d<diff){
                diff = d;
                answer = array[i];
            }
            else if(d==diff){ // 미리 배열을 정렬하고 진행하면 이 과정 필요 없음
                if(answer>array[i]) answer = array[i];
            }
        }
        return answer;
    }
}
