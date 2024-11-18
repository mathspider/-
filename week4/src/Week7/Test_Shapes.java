package Week7;

public class Test_Shapes {
    public static void main(String[] args) {
        Shape shape1=new Shape(4,"圆形");
        Shape shape2=new Shape(4,"正方形");
        Shape shape3=new Shape(5,6,"椭圆");
        shape1.S();shape1.C();
        shape3.C();shape3.S();
        shape2.S();shape2.C();
    }
}
