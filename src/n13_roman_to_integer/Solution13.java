package n13_roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    private static final Map<Character, Integer> map = new HashMap<>();
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {

        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            Integer temp = map.get(ch);
            if (i >= 1) {
                if (temp == 5 && s.charAt(i - 1) == 'I') {
                    temp = 4;
                    i--;
                } else if (temp == 10 && s.charAt(i - 1) == 'I') {
                    temp = 9;
                    i--;
                } else if (temp == 50 && s.charAt(i - 1) == 'X') {
                    temp = 40;
                    i--;
                } else if (temp == 100 && s.charAt(i - 1) == 'X') {
                    temp = 90;
                    i--;
                } else if (temp == 500 && s.charAt(i - 1) == 'C') {
                    temp = 400;
                    i--;
                } else if (temp == 1000 && s.charAt(i - 1) == 'C') {
                    temp = 900;
                    i--;
                }
            }
            res += temp;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("IX"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
