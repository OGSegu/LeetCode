package easy;

import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        int result = romanToInt("MCMXCIV");
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> symbolsMaps = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int result = symbolsMaps.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 1; i > 0; i--) {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i - 1);
            Integer currentInt = symbolsMaps.get(currentChar);
            Integer nextInt = symbolsMaps.get(nextChar);
            if (nextInt < currentInt) {
                result -= nextInt;
            } else {
                result += nextInt;
            }
        }
        return result;
    }
}
