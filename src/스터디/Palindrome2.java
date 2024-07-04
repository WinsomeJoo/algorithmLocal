package 스터디;

import java.util.Scanner;

/**
 문자열 s가 주어지면 s가 최대 문자 1개까지 지워서 회문문자열이 되면 “YES"를 출력하고,
 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.
*/

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String one="";
        String two="";
        String fullString="";

        one=input.substring(0,input.length()/2);
        two=input.substring(input.length()/2,input.length());


        fullString=one+two;

        StringBuilder sb = new StringBuilder(fullString);
        if(sb.reverse().toString().equalsIgnoreCase(fullString))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
