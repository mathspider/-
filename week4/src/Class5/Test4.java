package Class5;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(trsnsform(10));
    }
    static StringBuffer trsnsform(int m){//采用StringBuffer便于加字符串和反转
        StringBuffer stringBuffer=new StringBuffer();
        while (m>0) {
            int a=m%2;
            m=m/2;
            String s = String.valueOf(a);
            stringBuffer.append(s);
        }
        stringBuffer.reverse();
      return  stringBuffer;
    }
}
