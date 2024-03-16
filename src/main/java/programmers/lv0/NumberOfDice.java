package programmers.lv0;

public class NumberOfDice {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10,8,6},3));

    }

    public static int solution(int[] box, int n){
        int result = 1;
        for(int l:box){
            result*=l /n;
        }
        return result;
    }
}