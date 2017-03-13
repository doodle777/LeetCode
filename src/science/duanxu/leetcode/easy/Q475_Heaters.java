package science.duanxu.leetcode.easy;

import java.util.Arrays;
import java.util.Collections;

/**
 * 475. Heaters
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q475_Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        int[] left = new int[houses.length];
        int[] right = new int[houses.length];

        Arrays.sort(houses);
        Arrays.sort(heaters);

        for (int i = 0, index = 0; i < houses.length && index < heaters.length; i++) {
            // 位于houses[i]左方最大的heater
            while (index < heaters.length && heaters[index] <= houses[i]) {
                index++;
            }
            index--;
            if (index < 0) {
                index = 0;
                left[i] = Integer.MAX_VALUE;
            } else {
                left[i] = heaters[index];
            }
        }

        for (int i = houses.length - 1, index = heaters.length - 1; i >= 0  && index >= 0 ; i--) {
            // 位于houses[i]左方最大的heater
            while (index >= 0 && heaters[index] >= houses[i]) {
                index--;
            }
            index++;
            if (index >= heaters.length) {
                index = heaters.length - 1;
                right[i] = Integer.MAX_VALUE;
            } else {
                right[i] = heaters[index];
            }
        }

        // 寻找最大差值
        int max = 0;
        for (int i = 0; i < houses.length; i++) {
            left[i] = Math.abs(left[i] - houses[i]);
            right[i] = Math.abs(right[i] - houses[i]);
            max = Math.max(max, Math.min(left[i], right[i]));
        }

        return max;
    }
}
