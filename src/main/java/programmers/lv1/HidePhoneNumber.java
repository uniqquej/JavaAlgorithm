package programmers.lv1;

public class HidePhoneNumber {
    public static void main(String[] args) {
        System.out.println(solution2("027778888"));
    }

    public static String solution(String phoneNumber){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < phoneNumber.length()-4; i++){
            sb.append("*");
        }
         sb.append(phoneNumber.substring(phoneNumber.length()-4));

        return sb.toString();
    }

    public static String solution2(String phoneNumber){
        char[] chs = phoneNumber.toCharArray();
        for(int i=0; i<chs.length-4;i++){
            chs[i] = '*';
        }
        return String.valueOf(chs);
    }
}
