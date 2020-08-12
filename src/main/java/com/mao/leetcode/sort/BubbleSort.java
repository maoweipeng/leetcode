package com.mao.leetcode.sort;

import java.util.Comparator;

public class BubbleSort<T> implements Sort<T> {

    @Override
    public void sort(T[] list, Comparator<? super T> c) {
        T temp;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (c.compare(list[j], list[j + 1]) > 0) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
