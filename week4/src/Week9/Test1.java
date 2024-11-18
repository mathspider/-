package Week9;

import com.sun.source.tree.IfTree;

public class Test1 {
    public static void main(String[] args) {
        func1(3);
        System.out.println(func2(3));
    }
    static void  func1(int n){//循环
        String string = Integer.toBinaryString(n);
        int i=0;
        int num=0;
        for (int i1 = 0; i1 < string.length(); i1++) {
            if (string.charAt(i1)=='1'){
                num++;
            }
        }
        System.out.println("1的个数为:"+num);
    }
    static int  func2(int n){//递推
        int num=0;
       if (n==1){
           return ++num;
       }else {
           String string = Integer.toBinaryString(n);
           num++;
         return num+func2((int) (n-Math.pow(2,string.length()-1)));
       }
    }
}
