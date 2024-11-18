package Week8;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file=new File("d://f1.txt");
        BufferedInputStream br=new BufferedInputStream(new FileInputStream(file));
        String str=new String();
        int length =0;
        byte []bytes=new byte[1024];
        while ((length=br.read(bytes))!=-1){
            str+=new String(bytes,0,length);
        }
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            s[i]=s[i].toLowerCase();
        }
        System.out.println(Arrays.toString(s));
        HashMap<String,Integer>map=new HashMap<>();
        for (String s1 : s) {
            if (map.get(s1)==null){
                map.put(s1,1);
            }else {
                map.put(s1,map.get(s1)+1);
            }
        }
        int size = map.size();
        int []num=new int[size];
        int i=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            num[i++]=entry.getValue();
        }
        Arrays.sort(num);
        System.out.println(num[size-1]+"次");
        br.close();
    }
}
