package Week8;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(func1());
        System.out.println(func2(7, 2));
    }

    static int func1() {
        int n = 2;
        for (int i = 0; i < 7; i++) {
            n = (n + 1) * 2;
        }
        return n;
    }

    static int func2(int n, int m) {
        if (n <= 0) {
            return m;
        } else {
            return func2(--n, (m + 1) * 2);
        }
    }
}
/*
迭代方法优点：

简单直观，易于理解和实现。
代码结构清晰，不容易出现逻辑错误。
迭代方法缺点：

需要使用循环结构，可能存在代码冗余。
如果需要计算的次数很大，可能会导致代码过长。
递归方法优点：

代码结构简洁，逻辑清晰。
可以直接使用现成的递归函数模板。
递归方法缺点：

递归调用会增加额外的函数调用开销和堆栈空间消耗。
如果递归层数过深，可能导致堆栈溢出。
 */