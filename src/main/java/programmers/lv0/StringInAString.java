package programmers.lv0;

public class StringInAString {
    public static void main(String[] args) {
        System.out.println(solution("ppprrrogrammers","pppp"));
    }
    public static int solution(String str1, String str2){
        //contains, indexOf 사용 가능
        String newStr = str1.replaceAll(str2,"");
        return newStr.equals(str1) ?2:1;
    }
}
