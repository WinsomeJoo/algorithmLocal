//package 스터디;
//import java.util.*;
//
///**
//  알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//  문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하세요.
//  단 반복횟수가 1인 경우 생략합니다.
// */
//
//class StringCompression {
//    public String solution(String a){
//        String answer="";
//        String s= a+ " ";
//        int count =1;
//
//        for(int i=0; i< s.length()-1;i++){
//            if(s.charAt(i)==s.charAt(i+1)) {
//                count++;
//            }
//            else{
//                answer=answer+ s.charAt(i);
//                if(count>1){
//                    answer=answer + Integer.toString(count);
//                    count=1;
//                }
//            }
//        }
//        return answer;
//    }
//    public static void main(String[] args){
//        프로그래머스.StringCompression s11 = new 프로그래머스.StringCompression();
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        System.out.println(s11.solution(s1));
//    }
//}