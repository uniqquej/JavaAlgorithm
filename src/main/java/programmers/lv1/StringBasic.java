package programmers.lv1;

public class StringBasic {
    public static void main(String[] args) {
        System.out.println(solution("0198244"));

    }

    public static boolean solution(String s){
        if(s.length()==4 || s.length()==6) {
            s = s.replaceAll("[0-9]", "");
            return s.isEmpty();
        } else return false;
    }
}
