package programmers.lv0;

import java.util.*;

public class OnlyOnece {
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));

    }

    public static String solution(String s){
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> strList = new ArrayList<>();

        for(String alpha : s.split("")){
            if(hashMap.containsKey(alpha)) hashMap.replace(alpha, hashMap.get(alpha)+1);
            else hashMap.put(alpha, 1);
            // 조건문 없이 작성하는 법
            // hashMap.put(alpha,hashMap.getOrDefault(alpha,0)+1);
        }

        for(String key : hashMap.keySet()){
            if(hashMap.get(key)==1) strList.add(key);
        }
        strList.sort(Comparator.naturalOrder());
        return String.join("",strList);

    }
}
