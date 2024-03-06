package lv0;

public class SharePizza_2 {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
    public static int solution(int n){
        // 6과 n의 최소 공배수를 찾자
        for(int i =1;i<=n;i++){
            if(6*i%n==0)return i;
        }
        return 1;
    }
}
