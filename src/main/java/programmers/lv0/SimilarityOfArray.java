package programmers.lv0;

public class SimilarityOfArray {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"},new String[]{"add", "bgd", "c"}));

    }

    public static int solution(String[] s1,String[] s2){
        int answer = 0;
        for(String s: s1){
            for(String ss: s2){
                if(ss.equals(s)) answer +=1;
            }
        }
        return answer;
    }
}
