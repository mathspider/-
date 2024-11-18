package Week9;

public class Test2 {
    public static void main(String[] args) {
        int i = func1(100, 5);
        System.out.println(i);
    System.out.println(func1(100, 3));

    }
    static int func1(int n,int mod){
        if (n == 0) {//如果n是0，返回1
            return 1 % 5;
        }
        int t = func1(n / 2,mod);//分治
        if (n % 2 == 0) {//如果是偶数指数，返回
            return (t * t) % mod;
        } else {//如果是奇数，由于java除2会取整，故乘2在运算
            return (2 * t * t) % mod;
        }
    }
}
