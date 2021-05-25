package com.mao.leetcode.sort;

import java.util.Comparator;

public interface Sort<T> {
    void sort(T[] list, Comparator<? super T> c);
}
