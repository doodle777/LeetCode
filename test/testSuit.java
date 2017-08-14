import science.duanxu.leetcode.datastruct.TreeNode;
import science.duanxu.leetcode.easy.Q400_NthDigit;
import science.duanxu.leetcode.easy.Q437_PathSumIII;
import science.duanxu.leetcode.easy.Q441_ArrangingCoins;
import science.duanxu.leetcode.easy.Q475_Heaters;
import science.duanxu.leetcode.medium.*;

public class testSuit {
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        Q609_FindDuplicateFileInSystem test = new Q609_FindDuplicateFileInSystem();
        test.findDuplicate(paths);
    }
}
