package Week11;

public class Test2 {
    public static void main(String[] args) {
        int[]m={2,2,3,4,-3};
        int min=Integer.MAX_VALUE;//确保min初始化足够大
        int thismin=0;
        for (int i = 0; i < m.length; i++) {//循环遍历数组
            thismin+=m[i];//从左到右累加
            if (thismin>0&&thismin<=min){//如果thismin正，并且小于最小值
               min=thismin;//更新新的最小正子序列和
            }else if (min==Integer.MAX_VALUE&&i==m.length-1){//如果遍历完毕还没有更新则全为负数
                System.out.println("全为负数不存在最小正子序列和");
            }
        }
        System.out.println(min);
    }
}
