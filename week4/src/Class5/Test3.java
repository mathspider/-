package Class5;

public class Test3 {
    public static void main(String[] args) {
        func(1,2,3,4,5,6,7);
        func(1.0,2.1,3.2,6.9);
        func(1.0f,2.35f,96.544f,51.12f);
    }
    static void func(int ... m){
        double sum=0.0;
        for (int i : m) {
            sum+=i*i;
        }
        double sqrt = Math.sqrt(sum);
        System.out.println("这些整数的平方和的算数平方根为："+sqrt);
    }
    static void func(double ... m){
        double sum=0.0;
        for (double i : m) {
            sum+=i*i;
        }
        double sqrt = Math.sqrt(sum);
        System.out.println("这些双精度浮点数的平方和的算数平方根为："+sqrt);
    }
    static void func(float ... m){
        double sum=0.0;
        for (float i : m) {
            sum+=i*i;
        }
        double sqrt = Math.sqrt(sum);
        System.out.println("这些单精度浮点数的平方和的算数平方根为："+sqrt);
    }
}
