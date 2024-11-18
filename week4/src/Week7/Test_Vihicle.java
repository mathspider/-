package Week7;

public class Test_Vihicle {
    public static void main(String[] args) {
        Bus bus=new Bus();
        Bike bike=new Bike();
        bike.start(true);
        bus.start(true);
        bus.stop(true);
        bike.stop(true);
        bike.start(false);
        bus.start(false);
        bus.stop(false);
        bike.stop(false);
    }
}
