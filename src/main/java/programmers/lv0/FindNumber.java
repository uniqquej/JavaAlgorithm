package programmers.lv0;

public class FindNumber {
    public static void main(String[] args) {
        System.out.println(solution(29183,7));

    }

    public static int solution(int num, int k){
        String[] strArr = (num+"").split("");
        int answer = -1;
        for(int i =0; i<strArr.length;i++){
            if(strArr[i].equals(k+"")) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }

    public static int solution2(int num, int k){
        String strNum = num+"";
        String strK = k+"";
        int idx =  strNum.indexOf(strK);
        return idx<0 ?-1 :idx+1;

    }
}
