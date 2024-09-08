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
        System.out.println(solution(input));
    }

    public static String solution(String s) {
        String answer = "YES";
        int lt = 0;
        int rt = s.length() - 1;

        while (lt < rt) {
            if (s.charAt(lt) != s.charAt(rt)) {
                String s1 = s.substring(lt, rt);
                String s2 = s.substring(lt + 1, rt + 1);

                if (!isPalindrome(s1) && !isPalindrome(s2)) {
                    answer = "NO";
                }
                break;
            } else {
                lt++;
                rt--;
            }
        }
        return answer;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
