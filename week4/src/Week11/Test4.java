package Week11;

import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
 compare2 compare=new compare2();
 Integer[]m={1,2,5,5,8,9,45,65,32,78,7};
        System.out.println("binarySearch(m,78,compare) = " +binarySearch(m, 78, compare));
    }
   static  <T> int binarySearch(T[] m,T target,Comparator<? super T> comparator ){
            int left=0;
            int right= m.length-1;
            while (left<=right){
                int mid=(left+right)/2;
                if (comparator.compare(m[mid],target)>0){
                  right=mid;
                }else if (comparator.compare(m[mid],target)<0){
                    left=mid;
                }else
                    return mid;
            }
            return -1;
    }
}
class compare2 implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
