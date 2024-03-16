package programmers.lv0;

public class FindSyntheticNumbers {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }
    public static int solution(int n){
        int answer = 0;

        for(int num=1; num<=n;num++){
            int count = 0;
            for(int i=1;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    count++;
                }
            }
            if (count>=2){
                answer++;
            }
        }
        return answer;


    }
}
