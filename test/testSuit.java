import science.duanxu.leetcode.datastruct.TreeNode;
import science.duanxu.leetcode.easy.Q400_NthDigit;
import science.duanxu.leetcode.easy.Q437_PathSumIII;
import science.duanxu.leetcode.easy.Q441_ArrangingCoins;
import science.duanxu.leetcode.easy.Q475_Heaters;

public class testSuit {
    public static void main(String[] args) {
        int[] h1 = {1,2,3};
        int[] h2 = {2};
        int[] h3 = {1,2,3,4};
        int[] h4 = {1,4};

        Q475_Heaters test = new Q475_Heaters();
        test.findRadius(h1, h2);
        test.findRadius(h3, h4);
    }
}
