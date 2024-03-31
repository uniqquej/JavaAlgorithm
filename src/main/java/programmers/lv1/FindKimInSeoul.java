package programmers.lv1;

public class FindKimInSeoul {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }
    public static String solution(String[] seoul){
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");

        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) {
                sb.append(i);
                break;
            }
        }
        sb.append("에 있다.");
        return sb.toString();
    }
}
