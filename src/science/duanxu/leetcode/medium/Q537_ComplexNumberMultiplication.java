package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

/**
 * 537. Complex Number Multiplication
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q537_ComplexNumberMultiplication {
    private class Complex {
        int rel;
        int img;

        public Complex(int r, int i) {
            rel = r;
            img = i;
        }

        @Override
        public String toString() {
            return rel + "+" + img + "i";
        }
    }

    /**
     * 提取复数
     * @param str 原始字符串
     * @return 复数
     */
    private Complex parseFromString(String str) {
        String[] strs = str.split("\\+|i");
        int rel = Integer.parseInt(strs[0]);
        int img = Integer.parseInt(strs[1]);

        return new Complex(rel, img);
    }

    /**
     * 计算乘积
     * @param a a
     * @param b b
     * @return 乘积
     */
    public String complexNumberMultiply(String a, String b) {
        Complex ca = parseFromString(a);
        Complex cb = parseFromString(b);

        return new Complex(ca.rel * cb.rel - ca.img * cb.img,
                            ca.img * cb.rel + ca.rel * cb.img).toString();
    }
}
