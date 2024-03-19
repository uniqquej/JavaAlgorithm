package programmers.lv0;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatedChar {
    public static void main(String[] args) {
        System.out.println(solution("We are the world"));
    }

    public static String solution(String myString){
        List<String> strList = new ArrayList<>();
        for(String str : myString.split("")){
            if(!strList.contains(str)) strList.add(str);
        }

        return String.join("",strList);
    }
}
