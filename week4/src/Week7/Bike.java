package Week7;

public class Bike implements  Vihicle{

    @Override
    public void start(boolean start) {
        if (start==true) {
            System.out.println("自行车 启动!");
        }else {
            System.out.println("自行车 启动失败");
        }
    }

    @Override
    public void stop(boolean stop) {
        if (stop==true) {
            System.out.println("自行车 停下");
        }else {
            System.out.println("自行车 停下失败");
        }
    }
}
