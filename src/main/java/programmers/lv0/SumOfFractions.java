package programmers.lv0;

import java.util.Arrays;

public class SumOfFractions {
    public static void main(String[] args) {
        int[] a = solution(9,2,1,3);
        System.out.println(Arrays.toString(a));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int denom = denom1*denom2;
        int numer = numer1*denom2 + numer2*denom1;

        for(int i =Math.min(denom,numer);i>0; i--){

            if(denom%i==0&& numer%i==0){
                return new int[]{numer/i, denom/i};
            }
        }

        return new int[]{numer, denom};
    }
}
