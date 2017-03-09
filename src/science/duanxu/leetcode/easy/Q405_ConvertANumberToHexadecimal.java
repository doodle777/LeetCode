package science.duanxu.leetcode.easy;

import java.math.BigInteger;

/**
 * 405. Convert a Number to Hexadecimal
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q405_ConvertANumberToHexadecimal {
//    public String toHex(int num) {
//        return Integer.toHexString(num);
//    }
    private char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

    public String toHex(int num) {
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 15)] + result;
            num = (num >>> 4);
        }
        return result;
    }
}
