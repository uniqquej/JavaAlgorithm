package programmers.lv0;

public class AgeOfPlanet {
    public static void main(String[] args) {
        System.out.println(solution(51));
    }
    public static String solution(int age){
        String[] arr = "abcdefghij".split("");
        String answer = "";
        while(age>0){
            answer = arr[age%10] + answer;
            age /= 10;
        }
        return answer;
    }

    /*
    // 이 과정을 while문으로 묶으면 위의 코드
        if(age<10){
        return arr[age];
    }
        else if(age<100){
        int id1 = age/10;
        int id2 = age%10;
        return arr[id1]+arr[id2];
    }
        else if(age<1000){
        int id1 = age/100;
        int id2 = age%100/10;
        int id3 = age%10;
        return arr[id1]+arr[id2]+arr[id3];
    }
        else return "baaa";
        */
}
