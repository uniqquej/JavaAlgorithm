package programmers.lv0;

public class Lamb {
    public static void main(String[] args) {
        System.out.println(solution(64,6));
    }

    public static int solution(int n, int k){
        int yang = 12000*n;
        int drink = 2000*(k-n/10);
        return yang+drink;
    }
}
