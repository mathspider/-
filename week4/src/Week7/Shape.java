package Week7;

public class Shape {
    private  int r;
    private  int a;
    private  String shapes;
    public Shape(int r) {
        this.r = r;
    }
    public Shape(int r, int a, String shapes) {
        this.r = r;
        this.a = a;
        this.shapes = shapes;
    }
    public Shape(int r, String shapes) {
        this.r = r;
        this.shapes = shapes;
    }
    public  void C(){
        if (this.shapes.equals("圆形")){
            System.out.println("周长为： "+Math.PI*2*r);
        }else if (shapes.equals("正方形")){
            System.out.println("周长为： "+4*r);
        }else if (shapes.equals("椭圆")){
            System.out.println("周长为： "+Math.PI*(3.0*(a + r) - Math.sqrt((3.0*a + r) * (a + 3.0*r))));
        }else {
            System.out.println("超出范围，算不了了");
        }
    }
    public  void  S(){
        if (this.shapes.equals("圆形")){
            System.out.println("面积为： "+Math.PI*r*r);
        }else if (shapes.equals("正方形")){
            System.out.println("面积为： "+r*r);
        }else if (shapes.equals("椭圆")){
            System.out.println("面积为： "+Math.PI*a*r);
        }else {
            System.out.println("超出范围，算不了了");
        }
    }
}
