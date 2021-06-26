package easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
    }

    public static int[] plusOne(int[] digits) {
        int[] resultArray = digits;
        boolean neededToAddOne = true;
        int i = digits.length - 1;
        while (neededToAddOne) {
            if (digits[i] == 9) {
                if (i == 0) {
                    resultArray = new int[digits.length + 1];
                    resultArray[0] = 1;
                    return resultArray;
                }
                digits[i] = 0;
            } else {
                neededToAddOne = false;
                digits[i]++;
            }
            i--;
        }
        return resultArray;
    }
}
