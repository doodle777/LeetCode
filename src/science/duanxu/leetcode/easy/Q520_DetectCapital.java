package science.duanxu.leetcode.easy;

/**
 * 520. Detect Capital
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q520_DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean upperCaseFlag = false;
        boolean lowerCaseFlag = false;
        int lastUpperCase = -1;

        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                upperCaseFlag = true;
                lastUpperCase = i;
            } else {
                lowerCaseFlag = true;
            }
        }

        return (!lowerCaseFlag)          // All letters in this word are capitals, like "USA".
                || (!upperCaseFlag)      // All letters in this word are not capitals, like "leetcode".
                || (lastUpperCase == 0); // Only the first letter in this word is capital if it has more than one letter, like "Google".
    }
}
