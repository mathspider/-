package Class5;

public class Test5 {
    public static void main(String[] args) {
        System.out.println(transform(64));
    }
    static StringBuffer transform(int m){
        StringBuffer stringBuffer=new StringBuffer();
        while (m>0){
            int a=m%16;
            m=m/16;
            stringBuffer.append(a);
        }
        stringBuffer.reverse();
return stringBuffer;
    }
}
