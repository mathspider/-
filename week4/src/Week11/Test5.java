package Week11;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {

    }
    static <T extends Comparable<? super T>> List<T> find_or(List<T> L1, List<T> L2) {//计算并集
        List<T> all = new ArrayList<>();
        int alenth = 0;
        int blength = 0;
        T ta = L1.get(alenth);
        T tb = L2.get(blength);
        while (alenth <= L1.size() && blength <= L2.size()) {
            if (ta.compareTo(tb) < 0) {
                all.add(ta);
                alenth++;
            } else if (ta.compareTo(tb) == 0) {
                all.add(ta);
                alenth++;
                blength++;
            } else if (ta.compareTo(tb) > 0) {
                all.add(tb);
                blength++;
            }
        }
        if (alenth<L1.size()){
            for (int i = alenth; i < L1.size(); i++) {
                all.add(L1.get(i));
            }
            if (blength<L2.size()){
                for (int i = blength; i < L2.size(); i++) {
                    all.add(L2.get(i));
                }
            }
        }
        return all;
    }
    static <T extends Comparable<? super T>> List<T> find_and(List<T> L1,List<T> L2){//计算交集
        List<T> list=new ArrayList<>();
        for (T t : L1) {
            if (L2.contains(t)){
                list.add(t);
            }
        }
        return list;
    }
}