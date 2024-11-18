package Week7;

public class Bus implements Vihicle {

    @Override
    public void start(boolean start) {
        if (start == true) {
            System.out.println("公交车 启动！");
        }else {
            System.out.println("公交车 启动失败");
        }
    }

    @Override
    public void stop(boolean stop) {
        if (stop==true) {
            System.out.println("公交车 停下");
        }else {
            System.out.println("公交车 停下失败");
        }
    }
}
