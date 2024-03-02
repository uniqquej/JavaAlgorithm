package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwiceArray {
    public static void main(String[] args) {
        int[] a = solution(new int[]{1,2,4,5,6});
        System.out.println(Arrays.toString(a));
    }

    public static int[] solution(int[] numbers) {
        int[] ans = new int[numbers.length];
        for(int i=0;i< ans.length;i++){
            ans[i] = numbers[i]*2;
        }
        return ans;
    }
}
