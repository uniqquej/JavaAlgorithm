package programmers.lv0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OrderOfMedical {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
        System.out.println(Arrays.toString(solution3(new int[]{30, 10, 23, 6, 100})));
    }
    public static int[] solution(int[] emergency){
        /*
        1. 크기를 비교하려면 배열을 정렬한다.
        2. 같은 숫자를 찾아 인덱스를 반환한다.
         - sort는 오름차순 정렬임 > 내림차순을 해야함
         - int 타입은 reverse 사용 못함
         - index를 거꾸로 카운트하자
        */

        int[] newArr = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(newArr);

        int[] answer = new int[emergency.length];
        for(int i=0; i< emergency.length; i++){
            int num = emergency[i];

            int j=emergency.length;
            for(int a: newArr){
                if(a==num){
                    answer[i] =j;
                    break;
                }
                else j--;
            }
        }
        return answer;
    }


//배열을 정렬하지 않고, 자신보다 큰 숫자의 갯수를 카운트 해서 반환하면 됨
public static int[] solution2(int[] emergency) {

            int[] answer = new int[emergency.length];

            for(int i = 0; i < answer.length; i++){
                if(answer[i] != 0){
                    continue;
                }
                int idx = 1;
                for(int j = 0; j < answer.length; j++){
                    if(emergency[i] < emergency[j]){
                        idx++;
                    }
                }
                answer[i] = idx;
            }
            return answer;

    }

    public static int[] solution3(int[] emergency) {
        // hashmap 사용하여 2중 for문 사용 안함
            int len = emergency.length;
            int[] answer = new int[len];
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < len; i++) {
                map.put(emergency[i], i);
            }

            Arrays.sort(emergency);

            for (int i = len-1; i >= 0; i--) {
                answer[map.get(emergency[i])] = len - i;
            }

            return answer;
    }
}
