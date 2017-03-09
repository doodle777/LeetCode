package science.duanxu.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 500. Keyboard Row
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q500_KeyboardRow {
    private static final String[] alphabet = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<String>();
        for(String string : words) {
            for(String pattern : alphabet) {
                boolean flag = true;
                for(char ch : string.toCharArray()) {
                    ch = Character.toLowerCase(ch);
                    if(pattern.indexOf(ch) == -1) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    list.add(string);
                    break;
                }
            }
        }

        return list.toArray(new String[]{});
    }

    public static void main(String[] args) {
        String[] check = {"Hello", "Alaska", "Dad", "Peace"};
        String[] ret = findWords(check);
    }
}
