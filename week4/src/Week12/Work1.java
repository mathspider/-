package Week12;

import java.util.ArrayList;

public class Work1 {
    public static void main(String[] args) {
        circle(6,1,5);
    }
    static  void circle(int n,int s,int m){
        ArrayList<Integer>list=new ArrayList<>();//编号
        int i=1;
        while (i<=n) {
            list.add(i++);
        }
        int j=(s-1)% n;
        while (!list.isEmpty()){
             j=(j+m-1)% list.size();
            System.out.print(list.get(j)+" ");
            s=(j+1)% list.size();
            list.remove(j);
        }
    }
}
