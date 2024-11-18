import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
copy_file(new File("d:/f2.txt"),new File("d:/o2.txt"));
    }
    static void  copy_file(File src,File dest) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader(src));
        BufferedWriter bw=new BufferedWriter(new FileWriter(dest));
        String str;
        int i=1;
        while ((str=br.readLine())!=null){
            str=i+": "+str;
            bw.write(str+"\n"+"\n");
            i++;
        }
        br.close();
        bw.close();
    }
}
