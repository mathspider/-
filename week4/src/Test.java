import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("d:/java.txt");
//        BufferedInputStream br=new BufferedInputStream(new FileInputStream(file));
//        int n;
//        byte[] bytes=new byte[1024];
//        int length;
//        while ((length= br.read(bytes))!=-1){
//            System.out.print(new String(bytes,0,length));
//        }
//        br.close();
       BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        int length;//定义读取长度
        char[] chars=new char[1024];//构造缓冲数组
        while ((length=br.read(chars))!=-1){//循环判断
            System.out.println(new String(chars,0,length));//打印字符串，利用缓冲数组，字符流用char，字节流用byte
        }
//        BufferedWriter br=new BufferedWriter(new FileWriter(file,true));
////        br.write("你好");
////        br.newLine();
////        br.write("世界");
////        br.newLine();
//        br.write(String.valueOf(111));
//        br.close();
    }
}
