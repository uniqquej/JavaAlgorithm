package programmers.lv0;

public class RemoveVowels {
    public static void main(String[] args) {
        System.out.println(solution("nice to meet you"));

    }
    public static String solution(String myString){
        String[] vowels = {"a","e","i","o","u"};

        for(String v:vowels){
            myString = myString.replace(v,"");
        }

        // 정규식
        //return myString.replaceAll("[aeiou]", "");
       // return myString.replaceAll("a|e|i|o|u", "");

        return myString;

    }
}
