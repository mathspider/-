package Class5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
4.生成一个顺序数组，将这个数组的元素打乱顺序(做n次元素交换，第k次将数组的第k个元素与一个产生的随机位置进行交换，其中n为该数组长度，随机数可以使用Random类产生)后输出
*/
public class Test6 {
    public static void main(String[] args) {
        int[] generate = generate();
        change(generate);
    }
    static int [] generate(){
        System.out.println("请输入你想要产生的数组含有多少个数字");
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();
        int[]array=new int[i];
        for (int i1 = 0; i1 < i; i1++) {
            array[i1]=i1;
        }
        System.out.println("顺序数组为："+Arrays.toString(array));
        return  array;
    }
    static void change(int[] array){
        System.out.println("打乱之前的数组为："+Arrays.toString(array));
        Random random=new Random();
        int n,t;
        for (int i = 0; i < array.length; i++) {
             n = random.nextInt(array.length);
             t=array[i];
             array[i]=array[n];
             array[n]=t;
        }
        System.out.println("打乱之后的数组为："+Arrays.toString(array));
    }
}
