package programmers.lv0;

public class DivTwoNum {
    public static void main(String[] args) {
        System.out.println(solution(1,2));
    }

    public static int solution(int num1, int num2){
        double answer = (double)num1/num2 *1000;
        return (int)answer;
    }
}
