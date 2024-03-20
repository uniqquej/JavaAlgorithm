package programmers.lv0;

public class Letter {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
    }

    public static int solution(String message){
        return message.length()*2;
    }
}
