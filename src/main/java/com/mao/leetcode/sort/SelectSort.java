package com.mao.leetcode.sort;

import java.util.Comparator;

/**
 * 选择排序：
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕。
 * @param <T>
 */
public class SelectSort<T> implements Sort<T>{
    @Override
    public void sort(T[] list, Comparator<? super T> c) {
        T temp;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (c.compare(list[i], list[j]) > 0) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
