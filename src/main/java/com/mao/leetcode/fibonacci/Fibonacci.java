package com.mao.leetcode.fibonacci;

/**
 * 斐波那契数列，从第三项起，后一项等于前两项的和
 * 0，1，1，2，3，5，8，13，21...
 */
public class Fibonacci {
    /**
     * 递归方式
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n < 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 平推方式
     *
     * @param n
     * @return
     */
    public static int fibonacci1(int n) {
        if (n <= 0) {
            return 0;
        } else if (n < 2) {
            return 1;
        }

        int a = 1;
        int b = 1;
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    /**
     * 尾递归方式
     *
     * @param n
     * @return
     */
    public static int fibonacci2(int n, int a, int b) {
        if (n <= 0) {
            return 0;
        }

        if (n <= 2) {
            return b;
        }

        return fibonacci2(n - 1, b, a + b);
    }

    /**
     * 通项公式
     * @param n
     * @return
     */
    public static int fibonacci3(int n) {
        double j5 = Math.sqrt(5);

        double a = Math.pow((1 + j5) / 2, n);
        double b = Math.pow((1 - j5) / 2, n);
        return (int) ((1 / j5) * (a - b));
    }

    public static void main(String[] args) {
        System.out.print(Fibonacci.fibonacci(8));
        System.out.print(Fibonacci.fibonacci1(8));
        System.out.print(Fibonacci.fibonacci2(8, 1, 1));
        System.out.print(Fibonacci.fibonacci3(8));
    }
}

