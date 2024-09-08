package 프로그래머스;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfTestCases = scanner.nextInt();
        scanner.nextLine();

        String[] testCases = new String[numberOfTestCases];

        for (int i = 0; i < numberOfTestCases; i++) {
            testCases[i] = scanner.nextLine();
        }

        for (String s : testCases) {
            int length = s.length();

            if (length == 1) {
                System.out.println(1);
                continue;
            }

            int minLen = length;

            for (int unit = 1; unit <= length / 2; unit++) {
                StringBuilder compressed = new StringBuilder();
                String prev = s.substring(0, unit);
                int count = 1;

                for (int i = unit; i < s.length(); i += unit) {
                    String current;
                    if (i + unit > s.length()) {
                        current = s.substring(i);
                    } else {
                        current = s.substring(i, i + unit);
                    }

                    if (prev.equals(current)) {
                        count++;
                    } else {
                        if (count > 1) {
                            compressed.append(count).append(prev);
                        } else {
                            compressed.append(prev);
                        }
                        prev = current;
                        count = 1;
                    }
                }

                if (count > 1) {
                    compressed.append(count).append(prev);
                } else {
                    compressed.append(prev);
                }

                minLen = Math.min(minLen, compressed.length());
            }

            System.out.println(minLen);
        }

        scanner.close();
    }
}