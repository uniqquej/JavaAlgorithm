package programmers.lv0;

public class RepeatChar {
    public static void main(String[] args) {
        System.out.println(solution("hello",3));
    }

    public static String solution(String myString, int n){
        String answer = "";
        String[] arr = myString.split("");

//        int i = 0;

        for(String c: arr){
            // 1. String을 +연산으로 연결
            answer += c.repeat(n);

            //2. join 사용 > 시간이 더 적게 걸림
//            arr[i] = c.repeat(n);
//            i++
        }

//        answer = String.join("",arr);

        return answer;

    }
}
