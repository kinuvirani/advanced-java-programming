package arrayproblem;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftElement {
    static int[] shiftArray(int [] intArray, int shiftPosition) {
//        int [] shiftedArray = new int [intArray.length];
        int lastIndex = intArray.length, swap;
        for (int i = 0; i < shiftPosition; i++) {
            for (int j = 0; j < lastIndex - 1; j++) {
//                swap = intArray[j];
//                intArray[j] = intArray[lastIndex - 1];
//                intArray[lastIndex - 1] = swap;
                swap = intArray[j+1];
                intArray[j + 1] = swap;
                intArray[j] = swap;
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(i + "=" + intArray[i]);
        }
        return intArray;
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

        System.out.println("Enter an number of time you want to shift elements::");
        int shiftPosition = scanner.nextInt();

        System.out.println("Shifted array= " + Arrays.toString(shiftArray(intArray, shiftPosition)));
    }
}
