package 스터디;

import java.util.*;

public class ClassPresident {

    public static void main(String[] args) {

        HashMap<Character, Integer> numbersMap = new HashMap<>();

        Integer A=0;
        Integer B=0;
        Integer C=0;
        Integer D=0;
        Integer E=0;
        Integer [] numbers={A,B,C,D,E};


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for(int i=0; input.length()>i;i++){
            if(input.charAt(i)=='A'){
                A++;
                numbersMap.put('A',A);
            }
            else if (input.charAt(i)=='B') {
                B++;
                numbersMap.put('B',B);
            }else if (input.charAt(i)=='C') {
                C++;
                numbersMap.put('C',C);
            }else if (input.charAt(i)=='D') {
                D++;
                numbersMap.put('D',D);
            }else if (input.charAt(i)=='E') {
                E++;
                numbersMap.put('E',E);
            }
        }

        for(int i=0; numbers.length<i; i++){

            int max=numbers[0];
            if(numbers[i]>max){
                max=numbers[i];
            }
        }

        char maxKey='a';
        List<Character> keys = new ArrayList<>(numbersMap.keySet());
        for (int i = 0; i < keys.size(); i++) {
            int max=numbersMap.get(keys.get(0));
            char key = keys.get(i);
            int value = numbersMap.get(key);

            if(value>max){
                max=numbersMap.get(keys.get(i));
                maxKey=keys.get(i);
            }

        }

        System.out.println(maxKey);


    }
}
