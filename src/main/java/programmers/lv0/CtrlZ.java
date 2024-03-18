package programmers.lv0;

public class CtrlZ {
    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 Z"));

    }
    public static int solution(String s){
        String[] strArr = s.split(" ");
        int result = 0;

        for(int i=0; i< strArr.length; i++){
            if(strArr[i].equals("Z")) result -= Integer.parseInt(strArr[i-1]);
            else result += Integer.parseInt(strArr[i]);
        }
        return result;
    }
}
