package science.duanxu.leetcode.easy;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

/**
 * 412. Fizz Buzz
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        int lastFizz = 0;
        int lastBuzz = 0;
        for(int i = 1; i <= n; i++) {
            boolean fizz = i - lastFizz == 3;
            boolean buzz = i - lastBuzz == 5;
            if(fizz && buzz) {
                list.add("FizzBuzz");
                lastFizz = lastBuzz = i;
            } else if(fizz) {
                list.add("Fizz");
                lastFizz = i;
            } else if(buzz) {
                list.add("Buzz");
                lastBuzz = i;
            } else {
                list.add(Integer.toString(i));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String[] check = {"Hello", "Alaska", "Dad", "Peace"};
    }
}
