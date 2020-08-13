package com.mao.leetcode.sort;

import java.util.Comparator;

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
