package programmers.lv0;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(solution(7));

    }

    public static int solution(int n){
        // 1씩 커지는 숫자를 곱하면 된다.
        int num = 1;
        int check = 1;
        while(true){
            check *= num;
            if(check>n) return num-1;
            else num++;
        }
    }
}
