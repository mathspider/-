package Week7;

public class Car extends Auto{
    private  int number;
    private  String corlor;
    private  double weight;
    private  double v;
    private  boolean kongtiao=false;
    private  boolean cd=false;

    public Car(int number, String corlor, double weight, double v) {
        super(number, corlor, weight, v);
    }
    public Car() {
    }

    public Car(int number, String corlor, double weight, double v, boolean kongtiao, boolean cd) {
        this.number = number;
        this.corlor = corlor;
        this.weight = weight;
        this.v = v;
        this.kongtiao = kongtiao;
        this.cd = cd;
    }

    public  void add_v(double add){
        System.out.println("子类车加速到 "+(add+v));
    }
    public  void  sub_v(double sub){
        System.out.println("子类车减速到 "+(v-sub));
    }
    public void  on_cd(){
        cd=true;
        System.out.println("打开CD");
    }
    public void  off_cd(){
        cd=false;
        System.out.println("关闭CD");
    }
    public void  on_kongtiao(){
        kongtiao=true;
        System.out.println("打开空调");
    }
    public void off_kongtiao(){
        kongtiao=false;
        System.out.println("关闭空调");
    }
}
