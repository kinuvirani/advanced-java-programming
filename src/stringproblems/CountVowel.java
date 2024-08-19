package stringproblems;

import java.util.Scanner;

public class CountVowel {

    static boolean isValidateInputString(String str) {
        if (str == "" || str == null) {
            return false;
        }
        return true;
    }

    static int countVowels(String inputStr) {
        char [] charArray = inputStr.toLowerCase().toCharArray();
        char [] vowelArray = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (char ch: charArray) {
            for (int i = 0; i < vowelArray.length; i++) {
                if (ch == vowelArray[i]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:: ");
        String str = scanner.nextLine();
        boolean isValidInput = isValidateInputString(str);
        if (!isValidInput) {
            return;
        } else {
            System.out.println("Count is= " + countVowels(str));
        }
    }
}
