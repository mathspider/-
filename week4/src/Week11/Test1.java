package Week11;

public class Test1 {
    public static void main(String[] args) {
       int[]m={1,2,-3,-8,5,-7,9};
    int min=0;
    int thismin=0;
        for (int i = 0; i < m.length; i++) {
           thismin+=m[i];
           if (min>=thismin){
               min=thismin;
           }else if(thismin>=0){//如果累加到大于0，则初始化thismin
               thismin=0;
           }
        }

        System.out.println(min);
    }

}
