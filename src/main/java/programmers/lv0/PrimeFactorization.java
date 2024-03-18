package programmers.lv0;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactorization {
    public static void main(String[] args) {
        solution(12);
    }
    public static int[] solution(int n){
        List<Integer> intList = new ArrayList<>();

        for(int i=2; i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    n/=i;
                    if(!intList.contains(i)) intList.add(i);
                }
            }
        }

        // int[] result = intList.stream().mapToInt(i->i).toArray();

        int[] result = new int[intList.size()];
        for(int i=0; i<intList.size();i++){
            result[i] = intList.get(i);
        }

        return result;



    }
}
