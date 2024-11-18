import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {

sumfile(new File("d:/f1.txt"),new File("d:/f0.txt"));

    }
    static void sumfile(File src, File dest) throws IOException {
        int sum = 0;
        InputStream in = new FileInputStream(src);
        Writer ou = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest), "UTF-8"));
        byte[] bytes = new byte[1];
        int length;
        StringBuffer stringBuffer=new StringBuffer();
        while ((length = in.read(bytes)) != -1) {
            String str = new String(bytes, 0, length);
            stringBuffer = stringBuffer.append(str);
        }
        String[] split = stringBuffer.toString().split(",");
        for (String s : split) {
            sum+=Integer.parseInt(s);
        }
        System.out.println("和为：" + sum);
        ou.write(String.valueOf(sum));
        in.close();
        ou.close();
    }
}
