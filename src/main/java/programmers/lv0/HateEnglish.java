package programmers.lv0;

public class HateEnglish {
    public static void main(String[] args) {
        System.out.println(solution("onefourzerosixseven"));

    }

    public static Long solution(String numbers){
        String[] strArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i<strArr.length; i++){
            numbers = numbers.replaceAll(strArr[i],i+"");
        }

        return Long.parseLong(numbers);
    }
}
