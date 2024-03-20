package programmers.lv0;

public class UppercaseLowercaseLetters {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));

    }

    public static String solution(String myString){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<myString.length();i++){
            char c = myString.charAt(i);
            if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }
}
