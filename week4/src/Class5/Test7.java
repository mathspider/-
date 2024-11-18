package Class5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
5.假设一个文件 f3.txt(自行建立)有若干个整数，每行中两个整数之间使用一个或多个空格隔开，文件中可能有多行，但一个整数不会跨行，
请使用Scanner读取这些整数并求这些整数构成的数列的标准差，并将此结果写入到文件o3.txt中，读数时，分别以如下两种方法进行处理：
a)每次读一个整数；
b)每次读取一整行；
注：数列的标准差为：，其中：
 */
public class Test7 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = function1(new File("d:/f3.txt"));
        ArrayList<Integer> arrayList1 = founction2(new File("d:/f3.txt"));
        //standard(arrayList,new File("d:/o3.txt"));
        standard(arrayList1,new File("d:/o3.txt"));
    }
    static  double standard(ArrayList<Integer> array,File file) throws IOException {//封装计算链表平均数方法并计算出标准差
        double num=0;
        double x=0;
        for (Integer integer : array) {
            x+=integer;
        }
        x=x/array.size();
        for (Integer integer : array) {
            num+=(integer-x)*(integer-x);
        }
        num=num/array.size();
        num=Math.sqrt(num);
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        System.out.println("平均值为："+x);
        System.out.println("标准差为："+num);
        bw.write(String.valueOf(num));
        bw.close();
        return num;
    }
    static ArrayList<Integer> function1(File file) throws FileNotFoundException {//每次读取一个整数
        Scanner scanner=new Scanner(file);
        ArrayList<Integer> array=new ArrayList<>();
        while (scanner.hasNext()){
            array.add(scanner.nextInt());
        }//读取并存入array链表
        scanner.close();
        return array;
    }
    static  ArrayList<Integer> founction2(File file) throws FileNotFoundException {//方法二读取一整行，选择链表处理多个空格情况
        ArrayList<Integer> arrayList=new ArrayList<>();
        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            for (String s2 : s1) {
                if (!s2.equals("")){
                    arrayList.add(Integer.valueOf(s2));
                }
            }
        }
        scanner.close();
        return arrayList;
    }
}
