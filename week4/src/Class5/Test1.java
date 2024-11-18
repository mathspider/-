package Class5;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                if (b == a) continue;
                for (int c = 1; c <= 5; c++) {
                    if (c == a || c == b) continue;
                    for (int d = 1; d <= 5; d++) {
                        if (d == a || d == b || d == c) continue;
                        int e = 15 - a - b - c - d; // 因为总和为15
                        if (e == a || e == b || e == c || e == d) continue;
                      if (f(a==1)+f(b==2)+f(c==3)+f(d==4)+f(e==5)==0&&
                              f(a - b == 1) + f(b - c == 1) + f(c - d == 1) + f(d - e == 1) == 0
                              &&f(d == 1) + f(a == 2) + f(e == 3) + f(c == 4) + f(b == 5) == 2
                      &&f(d - a == 1) + f(a - e == 1) + f(e - c== 1) + f(c - b == 1) == 2){
                          System.out.println("A的名次为：第"+a+"名");
                          System.out.println("B的名次为：第"+b+"名");
                          System.out.println("C的名次为：第"+c+"名");
                          System.out.println("D的名次为：第"+d+"名");
                          System.out.println("E的名次为：第"+e+"名");
                      };

                    }
                }
            }
        }

    }
    static  int f(boolean b){
        if (b==true){
            return 1;
        }else {
            return 0;
        }
    }

}