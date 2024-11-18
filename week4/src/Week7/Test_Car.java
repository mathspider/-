package Week7;

public class Test_Car {
    public static void main(String[] args) {
        Car car=new Car(4,"黑色",100,500,false,false);
        car.add_v(20);
        car.off_cd();
        car.on_cd();
        car.sub_v(20);
        car.off_kongtiao();
        car.on_kongtiao();
        car.stop();
    }
}
