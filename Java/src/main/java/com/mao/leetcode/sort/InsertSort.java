package com.mao.leetcode.sort;

import java.util.Comparator;

/**
 * 1. 从第一个元素开始，该元素可以认为已经被排序；
 * 2. 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 3. 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 4. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 5. 将新元素插入到该位置后；
 * 6. 重复步骤 2~5。
 */
public class InsertSort<T> implements Sort<T> {
    @Override
    public void sort(T[] list, Comparator<? super T> c) {
        T temp;
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (c.compare(list[j - 1], list[j]) > 0) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
