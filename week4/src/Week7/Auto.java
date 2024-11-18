package Week7;

public class Auto {
    private  int number;
    private  String corlor;
    private  double weight;
    private  double v;

    public Auto() {
    }
    public Auto(int number, String corlor, double weight, double v) {
        this.number = number;
        this.corlor = corlor;
        this.weight = weight;
        this.v = v;
    }
    public Auto(int number, String corlor) {
        this.number = number;
        this.corlor = corlor;
    }
    public void  add_v(double add){
        System.out.println("速度提升至： "+add+v);
    }
    public  void  sub_v(double sub){
        System.out.println("速度减为： "+(v-sub));
    }
    public  void  stop(){
        v=0;
        System.out.println("停车"+"速度变为0");
    }
}
