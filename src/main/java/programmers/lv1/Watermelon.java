package programmers.lv1;

public class Watermelon {
    public static void main(String[] args) {
        System.out.println(solution2(4));

    }
    public static String solution(int n){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n;i++){
            String s = i%2==0? "수" :"박";
            sb.append(s);
        }
        return sb.toString();
    }

    public static String solution2(int n){
        if(n%2==0) return "수박".repeat(n/2);

        StringBuilder sb = new StringBuilder();

        sb.append("수박".repeat(n/2));
        sb.append("수");
        return sb.toString();
    }
}
