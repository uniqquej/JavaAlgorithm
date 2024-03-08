package programmers.lv0;

public class RemoveChar {
    public static void main(String[] args) {
        System.out.println(solution("BCBdbe","B"));

    }
    public static String solution(String myString, String letter){
        String[] arr = myString.split("");
        int i = 0;
        for(String s: arr){
            if(s.equals(letter)) arr[i]="";
            i++;
        }
        return String.join("",arr);

        // replace
        // return myString.replace(letter,"");
    }
}
