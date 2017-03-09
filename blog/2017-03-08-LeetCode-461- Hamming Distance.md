---
layout: post
date: 2016-03-08 14:19:30
title:  "LeetCode 461. Hamming Distance(EASY)"
category: ACM-Free
tags:   [LeetCode, ACM, Easy]
---

* content
{:toc}

### Discription:

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

#### Example:
  
> Input: x = 1, y = 4
>  
> Output: 2
> 
> Explanation:  
> 1　　(0 0 0 1)  
> 4　　(0 1 0 0)  
　　　　　　↑　　↑
> 
> The above arrows point to positions where the corresponding bits are different.

### 题目描述：

Hamming距离，即给定两个整数，求其对应二进制不同的位个数。

> 输入: x = 1, y = 4
>  
> 输出: 2
> 
> 解释:  
> 1　　(0 0 0 1)  
> 4　　(0 1 0 0)  
　　　　　　↑　　↑
> 
> 上述箭头所指的位置是二进制位不同的地方。

---

### 算法思想：

无

---

### 代码（Java）：

```java
public class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while(x != 0 || y != 0) {
            count += (x & 1) ^ (y & 1);
            x >>= 1;
            y >>= 1;
        }

        return count;
    }
}
```

