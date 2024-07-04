package 스터디;
import java.util.*;
class StringCompression {
    public String solution(String a){
        String answer="";
        String s= a+ " ";
        int count =1;

        for(int i=0; i< s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) {
                count++;
            }
            else{
                answer=answer+ s.charAt(i);
                if(count>1){
                    answer=answer + Integer.toString(count);
                    count=1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        StringCompression s11 = new StringCompression();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println(s11.solution(s1));
    }
}