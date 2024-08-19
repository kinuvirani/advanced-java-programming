package arrayproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
    static int[] findDuplicates(int [] intArray) {
        ArrayList<Integer> duplicateArray = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    if (!duplicateArray.contains(intArray[i])) {
                        duplicateArray.add(intArray[i]);
                    }
                }
            }
        }
        return duplicateArray.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array length::");
        int arySize = scanner.nextInt();

        System.out.println("Enter array element::");
        int [] intArray = new int[arySize];
        for (int i = 0; i < arySize; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println("Duplicate elements in array= " + Arrays.toString(findDuplicates(intArray)));
    }
}
