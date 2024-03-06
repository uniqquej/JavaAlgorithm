package programmers.lv0;

public class SharePizza_3 {
    public static void main(String[] args) {
        System.out.println(solution(7,10));
    }

    public static int solution(int slice, int n){
        return n % slice != 0 ? n/slice+1 : n/slice;
    }
}
