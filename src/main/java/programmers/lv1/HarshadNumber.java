package programmers.lv1;

public class HarshadNumber {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }

    public static boolean solution(int x){
        int check = 0;
        int inputX = x;
        while(inputX > 0){
            check += inputX%10;
            inputX /= 10;
        }

        return x%check == 0;
    }
}
