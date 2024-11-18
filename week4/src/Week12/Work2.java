package Week12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Work2 {
    public static void main(String[] args) {
        find(1000000,new File("d:/f.txt"));
    }
    static  void  find(int n, File file){
        if (!file.exists()){
            try {
                boolean newFile = file.createNewFile();
                if (newFile){
                    System.out.println("文件创建成功");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedWriter br=null;
        try {
             br=new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean[] isPrime = new boolean[n+1];
        isPrime[0] = isPrime[1] = true;//数字0和1都不是素数，所以赋true

        int[] Prime = new int[n];//存放素数的数组
        int t = 0;
        Prime[t++] = 2;//把2放进素数表
        for (int i = 2; i < n; i++) {
            if (!isPrime[i])//若当前数是素数
                Prime[t++] = i;//则存入素数数组
            for (int j = 0; j < t && Prime[j] * i < n; j++) {
                isPrime[i * Prime[j]] = true;
                if (i % Prime[j] == 0)
                    break;//避免重筛,使得程序更有效率
            }
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if (!isPrime[i]){
                try {
                    br.write(i+" ");
                    count++;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (count%10==0){
                    try {
                        br.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
