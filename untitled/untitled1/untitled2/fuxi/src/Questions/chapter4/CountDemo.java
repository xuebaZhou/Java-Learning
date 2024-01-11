package Questions.chapter4;

import java.util.Scanner;

public class CountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = scanner.nextLine();

        int letterCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("字符串中包含的字母个数：" + letterCount);
        System.out.println("字符串中包含的数字个数：" + digitCount);
        System.out.println("字符串中包含的其他符号个数：" + otherCount);
    }
}
