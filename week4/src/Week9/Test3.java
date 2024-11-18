package Week9;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("F(10) -2= " + (F(10)-2));
        System.out.println("Fsum(8) = " + Fsum(8));
        double d=(Math.sqrt(5)+1)/2.0;
        System.out.println("F(15) = " + F(15));
        System.out.println("Math.pow(d,15) = " + Math.pow(d, 15));
        System.out.println((1/Math.sqrt(5)) * (Math.pow(((1 + Math.sqrt(5))/2),10)
                - Math.pow(((1 - Math.sqrt(5))/2),10)));
//F(n) = (1/sqrt(5)) * (((1 + sqrt(5))/2)^n - ((1 - sqrt(5))/2)^n)
    }
    static int F(int n){
        if (n==1){
            return 0;
        }else if (n==2){
            return 1;
        }else if (n==3){
            return 2;
        }else {
            return F(n-1)+F(n-2);
        }
    }
    static int Fsum(int n){
        if (n==2){
            return 1;
        }else {
            return Fsum(n-1)+F(n);
        }
    }
}
