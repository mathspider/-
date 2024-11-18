package Class5;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
getnum();
    }
    static  void  getnum(){
        System.out.println("请输入你要计算的A，B点坐标，以逗号按顺序输入");
        Scanner scanner=new Scanner(System.in);
        String[] split = scanner.nextLine().split(",");
        double length;
        length=f(Double.valueOf(split[0])-Double.valueOf(split[2]))+f(Double.valueOf(split[1])-Double.valueOf(split[3]));
        length=Math.sqrt(length);
        System.out.printf("%.3f", length);
    }
    static double f(double d){
        return d*d;
    }
}
