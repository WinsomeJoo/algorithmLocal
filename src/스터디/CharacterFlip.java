package 스터디;
import java.util.Scanner;

/**
 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기
 자리에 그대로 있는 문자열을 만들어 반환하는 프로그램을 작성하세요.
 */

public class CharacterFlip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] iArray=input.toCharArray();

        int lt =0;
        int rt=iArray.length-1;
        char tmp;

        while(lt<rt){
           if (!Character.isAlphabetic(iArray[lt])) {
                lt++;
            }else if(!Character.isAlphabetic(iArray[rt])){
                rt--;
            }else{
               tmp=iArray[lt];
               iArray[lt]=iArray[rt];
               iArray[rt]=tmp;
               lt++;
               rt--;
           }
        }
        System.out.println(String.valueOf(iArray));
    }
}
