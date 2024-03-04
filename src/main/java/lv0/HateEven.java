package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateEven {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }
    public static int[] solution(int n){
        int length = n/2;
        int idx = 0;

        if(n%2==0){
            length = n/2;
        }else{
            length = n/2+1;
        }

        int[] answer = new int[length];
        for (int i=1; i<=n; i+=2 ){
            answer[idx] = i;
            idx++;
        }
        return answer;

    }
}
/*
// list > array

    List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
                if(i % 2 == 1){
                answer.add(i);
                }
                }
                return answer.stream().mapToInt(x -> x).toArray();
 */
