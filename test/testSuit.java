import science.duanxu.leetcode.datastruct.TreeNode;
import science.duanxu.leetcode.easy.Q400_NthDigit;
import science.duanxu.leetcode.easy.Q437_PathSumIII;
import science.duanxu.leetcode.easy.Q441_ArrangingCoins;
import science.duanxu.leetcode.easy.Q475_Heaters;
import science.duanxu.leetcode.medium.Q406_QueueReconstructionByHeight;
import science.duanxu.leetcode.medium.Q442_FindAllDuplicatesInAnArray;
import science.duanxu.leetcode.medium.Q498_DiagonalTraverse;
import science.duanxu.leetcode.medium.Q503_NextGreaterElementII;

public class testSuit {
    public static void main(String[] args) {
        int[][] table = {{1,2,3},{4,5,6},{7,8,9}};
        Q498_DiagonalTraverse test = new Q498_DiagonalTraverse();
        test.findDiagonalOrder(table);
    }
}
