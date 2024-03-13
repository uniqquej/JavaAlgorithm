package programmers.lv0;

public class RockScissorsPaper {
    public static void main(String[] args) {
        System.out.println(solution("2"));
    }

    public static String solution(String rsp){
        // String +연산 사용하지말고 StringBuilder 사용하는게 시간이 적게 걸림
        StringBuilder answer = new StringBuilder();

        for(String str : rsp.split("")){
            if(str.equals("2")) answer.append("0");
            if(str.equals("0")) answer.append("5");
            if(str.equals("5")) answer.append("2");
        }

        return answer.toString();
    }
}
