package Week11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
int a[]={6,5,4};
int b[]={5,4,3,2};
find_and(a,b).forEach(System.out::println);
    }
    static List<Integer> find_and(int[]a,int[]b){
        List<Integer>list=new ArrayList<>();
        int alength=0;
        int blength=0;
        int Ta=1;
        int Tb=1;
        if (a[0]>a[a.length-1]){
            alength=a.length-1;
            Ta=-1;
        }
        if (b[0]>b[b.length-1]){
            blength=b.length-1;
            Tb=-1;
        }
      while (alength>=0&&blength>=0&&alength<a.length&&blength<b.length){
          if (a[alength]==b[blength]){
              list.add(a[alength]);
              alength+=Ta;
              blength+=Tb;
          }else if (a[alength]>b[blength]){
                   blength+=Tb;
          }else {
              alength+=Ta;
          }
      }
        return list;
    }
}
