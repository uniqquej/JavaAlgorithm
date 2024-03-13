package programmers.lv0;

public class SharingBead {
    public static void main(String[] args) {
        System.out.println(solution(30,28));
    }

    public static int solution(int balls, int share){
        if(balls==share) return 1;
        //조합(combination)
        // int로 하면 오버플로우에 의해 몇몇 케이스에서 오류발생
        double deno = 1;
        double mole = 1;

        for(int i=balls;i>share;i--){
            deno *= i;
        }

        for(int k=balls-share; k>0; k--){
            mole *= k;
        }

        return (int)(deno/mole);
    }

}
