import java.util.Scanner;

public class Bonus {
    /*
    1.企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
    利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
    20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
    60万到100万之间时，高于60万元的部分，可提成1.5%
    ，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，
    求应发放奖金总数？
     */
    public static void main(String[] args) {
        give();
    }
    public static void give(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入公司今年利润："+"(万)");
        double profit = scanner.nextDouble();
        if (profit<0){
            System.out.println("利润小于0，没奖金");
        }
           else if (profit<=10){
            System.out.println("应发放奖金总数: "+0.1*profit+"万");
            }else if (profit<=20){
            System.out.println("应发放奖金总数: "+(10*0.1+(profit-10)*0.075)+"万");
            }else if (profit<=40){
            System.out.println("应发放奖金总数: "+(10*0.175+(profit-20)*0.05)+"万");
        }else if (profit<=60){
            System.out.println("应发放奖金总数: "+(10*0.175+20*0.05+(profit-40)*0.03)+"万");
        }else if (profit<=100){
            System.out.println("应发放奖金总数: "+(10*0.175+20*0.08+(profit-60)*0.015)+"万");
        }else {
            System.out.println("应发放奖金总数: "+(10*0.175+40*0.08+40*0.015+(profit-100)*0.01)+"万");
        }
    }
}
