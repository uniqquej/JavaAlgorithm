package programmers.lv1;

public class AddNotFoundNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));

    }

    public static int solution(int[] numbers){
        int answer = 0;
        for(int i=0; i<10;i++){
            answer+=i;
        }
        for(int num: numbers){
            answer -= num;
        }

        return answer;
    }
}

