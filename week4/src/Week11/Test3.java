package Week11;

public class Test3 {
    public static void main(String[] args) {
        int m[]={2,-4,8,-6,-3,5,8};
        int max=Integer.MIN_VALUE;
        int thismax=1;
        int thismin=1;
        for (int i = 0; i < m.length; i++) {
            if (m[i]<0){
               int  t=thismax;
               thismax=thismin;
               thismin=t;
            }
            thismax=Math.max(thismax*m[i],m[i]);
            thismin=Math.min(thismin*m[i],m[i]);
            max=Math.max(thismax,max);
        }
        System.out.println(max);
    }
}
